package by.epam.tr.task7.book;

import java.util.*;

public class BookStore {
	
	private List<Book> catalog;
	private String selectedAuthor;
	private String selectedPublisher;
	public int selectedYear;

	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookStore(List<Book> catalog) {
		this.catalog = catalog;
	}

	public void setSelectedYear(int selectedYear) {
		this.selectedYear = selectedYear;
	}

	public int getSelectedYear() {
		return selectedYear;
	}

	public void setSelectedPublisher(String selectedPublisher) {
		this.selectedPublisher = selectedPublisher;
	}

	public String getSelectedPublisher() {
		return selectedPublisher;
	}

	public void setSelectedAuthor(String selectedAuthor) {
		this.selectedAuthor = selectedAuthor;
	}

	public String getSelectedAuthor() {
		return selectedAuthor;
	}

	public void setCatalog(List<Book> catalog) {
		this.catalog = catalog;
	}

	public List<Book> getCatalog() {
		return catalog;
	}

	public List<Book> sortAuthor() {
		List<Book> sortAuthor = new ArrayList<>();
		for (Book element : catalog) {
			if (element.getAuthor().equals(selectedAuthor)) {
				sortAuthor.add(element);
			}
		}
		return sortAuthor;
	}

	public List<Book> sortPublisher() {
		List<Book> sortPublisher = new ArrayList<>();
		for (Book element : catalog) {
			if (element.getPublisher().equals(selectedPublisher)) {
				sortPublisher.add(element);
			}
		}
		return sortPublisher;
	}

	public List<Book> sortYear() {
		List<Book> sortYear = new ArrayList<>();
		for (Book element : catalog) {
			if (element.getYear() > selectedYear) {
				sortYear.add(element);
			}
		}
		return sortYear;
	}

	public void printBook(List<Book> l) {
		System.out.println("------------------------------------------------------------------");
		System.out.printf("|%-2s|%-10s|%-12s|%-10s|%-5s|%-5s|%-5s|%-8s|\n", "ID", "NAMEBOOK", "AUTHOR", "PUBLISHER",
				"YEAR", "PAGES", "PRICE", "BINDING");
		System.out.println("------------------------------------------------------------------");
		for (Book element : l) {
			System.out.printf("|%-2d|%-10s|%-12s|%-10s|%-5d|%-5d|%-5d|%-8s|\n", element.getId(), element.getNameBook(),
					element.getAuthor(), element.getPublisher(), element.getYear(), element.getNumberOfPages(),
					element.getPrice(), element.getBindingType());
		}
		System.out.println("------------------------------------------------------------------");
	}

}
