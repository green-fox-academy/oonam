package PostIt;

public class PostIt {
    String backgroundColor;
    String textColor;
    String text;

    public PostIt (String backgroundColor, String textColor, String text) {
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
        this.text = text;
    }

    public String toString() {
        return "Post it: " + this.backgroundColor + ", " + this.textColor + ", " + this.text;
    }
}
