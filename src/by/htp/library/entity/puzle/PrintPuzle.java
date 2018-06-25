package by.htp.library.entity.puzle;

import by.htp.library.entity.EntityDB;

public class PrintPuzle extends EntityDB {

	private int bookId;
	private String complexity;

	public PrintPuzle(int id, int bookId) {
		super(id);
		this.bookId = bookId;
	}

	public PrintPuzle(int id, int bookId, String complexity) {
		this(id, bookId);
		this.complexity = complexity;
	}

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Print Puzle complexity: " + complexity;
	}

}
