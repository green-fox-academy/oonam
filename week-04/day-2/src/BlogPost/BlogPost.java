package BlogPost;

public class BlogPost {
	String authorName;
	String title;
	String text;
	String publicationDate;

	public BlogPost (String authorName, String title, String text, String publicationDate) {
		this.authorName = authorName;
		this.title = title;
		this.text = text;
		this.publicationDate = publicationDate;
	}

	public String toString() {
		return "\"" + this.title + "\" " + "titled by " + this.authorName + " posted at \"" + this.publicationDate + "\" \n " +
						"\t" + this.text + "\n";
	}
}