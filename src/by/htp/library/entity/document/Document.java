package by.htp.library.entity.document;

import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.EntityDB;

public abstract class Document extends EntityDB implements LibraryEntity {

	private String title;
	private int numberOfPages;

	public Document(int id, String title, int numberOfPages) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
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

	@Override
	public String toString() {
		return "Title: " + title + ", number Of Pages:" + numberOfPages;
	}

}
