package pe.edu.upc.aww.werecycle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aww.werecycle.dtos.PublicationLikesDTO;
import pe.edu.upc.aww.werecycle.entities.Publication;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface IUPublicationRepository extends JpaRepository<Publication, Integer> {


    @Query(value = "SELECT p.id_publication AS idPublication,u.user_name AS userName,p.title, CAST(SUM(l.count_likes) AS INT) AS totalLikes " +
            "FROM Useror u " +
            "JOIN Publication p ON p.id_user = u.id_user " +
            "JOIN Likes l ON l.id_publication = p.id_publication " +
            "GROUP BY u.id_user,p.id_publication, p.title " +
            "HAVING CAST(SUM(l.count_likes) AS INT) = (SELECT MAX(likesSum) " +
            "FROM (SELECT CAST(SUM(l2.count_likes) AS INT) AS likesSum FROM Publication p2 JOIN Likes l2 ON p2.id_publication = l2.id_publication GROUP BY p2.id_publication) AS likesSums)",
            nativeQuery = true)
    List<Object[]> findPublicationsWithMostLikes();

    default List<PublicationLikesDTO> findPublicationLikesDTOWithMostLikes() {
        List<Object[]> results = findPublicationsWithMostLikes();
        List<PublicationLikesDTO> dtos = new ArrayList<>();

        for (Object[] result : results) {
            PublicationLikesDTO dto = new PublicationLikesDTO();
            dto.setIdPublication((int) result[0]);
            dto.setTitle((String) result[2]);
            dto.setUserName((String) result[1]);
            dto.setCount_likes((int) result[3]);
            dtos.add(dto);
        }

        return dtos;
    }

}

