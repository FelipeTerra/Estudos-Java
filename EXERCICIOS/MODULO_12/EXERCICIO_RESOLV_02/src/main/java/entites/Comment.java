package entites;

public class Comment {

    private String text;

    //Constructors
    public Comment(){ //default constructor
    }

    public Comment(String text) {
        this.text = text; //constructor with arguments
    }

    //getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
