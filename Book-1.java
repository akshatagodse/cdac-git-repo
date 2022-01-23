package questions;

public class Book implements Comparable<Book>{
	String name;
	String author;
	public  Book(String name,String author) {
		this.name=name;
		this.author=author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	@Override
	public int compareTo(Book o) {

		return o.name.compareTo(this.name);
	}
	
}
