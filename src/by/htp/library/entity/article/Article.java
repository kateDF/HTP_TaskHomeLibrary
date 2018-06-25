package by.htp.library.entity.article;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.LibraryEntity;

public class Article extends EntityDB implements LibraryEntity {
	public static final String TYPE = "Article";

	private int bookId;
	private String title;
	private String author;
	private int yearOfPublication;
	private String language;

	public Article(int id, int bookId, String title, String author, int yearOfPublication, String language) {
		super(id);
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.language = language;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Article title: " + title + ". Author: " + author + ", " + yearOfPublication
				+ " year of publication. Language: " + language;
	}

}
