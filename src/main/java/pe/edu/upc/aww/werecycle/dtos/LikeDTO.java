package pe.edu.upc.aww.werecycle.dtos;


import pe.edu.upc.aww.werecycle.entities.Publication;



public class LikeDTO {
    private int idLike;


    private Publication idPublication;


    private int countLikes;


    public int getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
    }

    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }

    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
    }
}
