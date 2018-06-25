package by.htp.library.entity.album;

import java.util.Arrays;
import java.util.List;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.HasAuthors;
import by.htp.library.entity.LibraryEntity;

public class Album extends EntityDB implements LibraryEntity, HasAuthors {
	public static final String TYPE = "Album";

	private String title;
	private int numberOfPages;
	private String subject;
	private String painter;
	private int numberOfPictures;

	public Album(int id, String title, int numberOfPages, String subject, String painter, int numberOfPictures) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.subject = subject;
		this.painter = painter;
		this.numberOfPictures = numberOfPictures;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPainter() {
		return painter;
	}

	public void setPainter(String painter) {
		this.painter = painter;
	}

	public int getNumberOfPictures() {
		return numberOfPictures;
	}

	public void setNumberOfPictures(int numberOfPictures) {
		this.numberOfPictures = numberOfPictures;
	}

	@Override
	public String toString() {
		return "Album: " + title + ", number Of Pages: " + numberOfPages + ". Subject: " + subject + ", painter: "
				+ painter + ", number Of Pictures: " + numberOfPictures;
	}

	@Override
	public List<String> getAuthors() {
		// In the scope of Album painter equal to Author
		return Arrays.asList(painter);
	}

}
