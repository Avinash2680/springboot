package My.books.name;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//store records in database
public class Books {

	@Id//is used to primary key of the entity.
	@GeneratedValue(strategy = GenerationType.IDENTITY)//used to generated value.
	
	private int id;
	private String bookname;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(int id, String bookname, int price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
	} 
	
	
}
