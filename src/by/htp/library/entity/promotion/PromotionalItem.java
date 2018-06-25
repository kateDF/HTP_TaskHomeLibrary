package by.htp.library.entity.promotion;

import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.EntityDB;

public abstract class PromotionalItem extends EntityDB implements LibraryEntity {

	private String title;
	private String format;
	private int numberOfPages;

	public PromotionalItem(int id, String title, String format, int numberOfPages) {
		super(id);
		this.title = title;
		this.format = format;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", format: " + format + ", number Of Pages: " + numberOfPages;
	}

}
