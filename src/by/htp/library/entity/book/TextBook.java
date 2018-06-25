package by.htp.library.entity.book;

import java.util.List;

public class TextBook extends Book {
	public static final String TYPE = "TextBook";

	private String title;
	private String subject;

	public TextBook(int id, String title, int numberOfPages, String subject, List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.title = title;
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Text Book: " + super.toString() + title + ", subject: " + subject;
	}

}
