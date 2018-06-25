package by.htp.library.entity.book;

import java.util.List;

import by.htp.library.entity.puzle.PrintPuzle;

public class ToyBook extends Book {
	public static final String TYPE = "ToyBook";

	private String publishingHouse;
	private String bookCover; // ????
	private String composition;
	private String size;
	private List<PrintPuzle> printPuzle;

	public ToyBook(int id, String title, int numberOfPages, List<String> author, String publishingHouse,
			String bookCover, String composition, String size) {
		super(id, title, numberOfPages, author);
		this.publishingHouse = publishingHouse;
		this.bookCover = bookCover;
		this.composition = composition;
		this.size = size;
	}

	public ToyBook(int id, String title, List<String> author, int numberOfPages, String publishingHouse,
			String bookCover, String composition, String size, List<PrintPuzle> printPuzle) {
		this(id, title, numberOfPages, author, publishingHouse, bookCover, composition, size);
		this.printPuzle = printPuzle;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getBookCover() {
		return bookCover;
	}

	public void setBookCover(String bookCover) {
		this.bookCover = bookCover;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<PrintPuzle> getPrintPuzle() {
		return printPuzle;
	}

	public void setPrintPuzle(List<PrintPuzle> printPuzle) {
		this.printPuzle = printPuzle;
	}

	@Override
	public String toString() {
		return "Toy Book: " + super.toString() + ". publishing House: " + publishingHouse + ". Book Cover: " + bookCover
				+ ", composition: " + composition + ". Size=" + size + ". Print puzle: " + printPuzle;
	}

}
