package entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //class attributes
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    //Fazendo composiçao com a lista
    //Muito importante instanciar a lista aqui para ela não ser nula
    private List<Comment> comments = new ArrayList<>();

    //Constructors

    //Default Constructor
    public Post(){
    }

    //Constructor with arguments
    public Post( Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    //Getters and Setters
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    //Para proteção da lista, aqui não é preciso colocar o método set.List,
    // pois assim é possível garantir que nenhum usuário irá passar um valor null
    // ou passar uma lista completamente nova

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public void removeComment(Comment comment){
        comments.remove(comment);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(title).append("\n");
        sb.append(likes).append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("\n");
        sb.append("------ comments ------ \n");

        //percorrendo o arrey de comentários
        for (Comment comment : comments) {
            sb.append(comment.getText()).append("\n");
        }

        return sb.toString();
    }
}
