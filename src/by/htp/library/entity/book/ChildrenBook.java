package by.htp.library.entity.book;

import java.util.List;

public class ChildrenBook extends Book {
	public static final String TYPE = "ChildrenBook";

	private String genre;
	private String plot;
	private String publishingHouse;

	public ChildrenBook(int id, String title, int numberOfPages, String genre, String plot, String publishingHouse,
			List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.genre = genre;
		this.plot = plot;
		this.publishingHouse = publishingHouse;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	@Override
	public String toString() {
		return "Children`s Book " + super.toString() + ". Genre: " + genre + ", plot: " + plot + ". Publishing House: "
				+ publishingHouse;
	}

}
