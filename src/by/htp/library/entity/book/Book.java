package by.htp.library.entity.book;

import java.util.List;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.HasAuthors;
import by.htp.library.entity.LibraryEntity;

public class Book extends EntityDB implements LibraryEntity, HasAuthors {
	public static final String TYPE = "Book";

	private String title;
	private int numberOfPages;
	private List<String> authors;

	public Book(int id, String title, int numberOfPages, List<String> authors) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Title: " + title + ". Number of pages: " + numberOfPages + ", authors:" + authors;
	}

}
