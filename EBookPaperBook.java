package cse215_lab_tasks_08;

class Book{
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	public Book() {
		
	}
	public Book(String isbn, String title, String author, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String toString() {
		return "ISBN: " + this.isbn + ", " + "\nTitle: " + this.title + ", " + "\nAuthor Name: " + this.author + ", " + "\nPrice: " + this.price + " TK";
	}
}

class EBook extends Book{
	String downloadUrl;
	double sizeMB;
	
	public EBook(String isbn, String title, String author, double price, String downloadUrl, double sizeMB) {
		super(isbn, title, author, price);
		this.downloadUrl = downloadUrl;
		this.sizeMB = sizeMB;
	}
	public String toString() {
		return super.toString() + ", " + "\nUrl for downlad book: " + this.downloadUrl + ", " + "\nBook Size: " + this.sizeMB + " MB";
	}
}

class PaperBook extends Book{
	double shippingweight;
	int inStock;
	
	public PaperBook(String isbn, String title, String author, double price, double shippingweight, int inStock) {
		super(isbn, title, author, price);
		this.shippingweight = shippingweight;
		this.inStock = inStock;
	}
	
	public String toString() {
		return super.toString() + ", " + "\nShipping Weight: " + this.shippingweight+ " Kg" + ", " + "\nStock of Books: " + this.inStock +" pieces";
	}
}
public class EBookPaperBook {
	public static void main(String[] args) {
		EBook eb1 = new EBook("2021-2021-21", "Java Programming", "Mosroor Mofiz", 300.0, "www.google.com/jp.pdf", 3.5);
		PaperBook eb2 = new PaperBook("2021-2021-22", "Java Programming version 2.0", "Arman", 350.0, 2.00, 10);
		
		System.out.println(eb1.toString());
		System.out.print("\n");
		System.out.println(eb2.toString());
	}
}
