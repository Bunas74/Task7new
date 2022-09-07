package by.epam.tr.task7.book;

public class Book {

	private int id;
	private String nameBook;
	private String author;
	private String publisher;
	private int year;
	private int numberOfPages;
	private int price;
	private String bindingType;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String nameBook, String author, String publisher, int year, int numberOfPages, int price,
			String bindingType) {
		this.id = id;
		this.nameBook = nameBook;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getBindingType() {
		return bindingType;
	}

}
