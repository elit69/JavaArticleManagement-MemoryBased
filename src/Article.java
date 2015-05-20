import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
	private int id;
	private String title;
	private String author;
	private String publishDate;
	private String modifiedDate;
	private String content;
	public static int MAX_ID = 1;
	
	public Article(){
		
	}
	public Article(String title, String author, String content){
		this.title = title;
		this.author = author;
		this.content = content;
		id = MAX_ID++;
		//publishDate = new SimpleDateFormat().toString();
		modifiedDate = publishDate;
	}
}
