package by.htp.library.entity.book;

import java.util.List;

public class Almanac extends Book {
	public static final String TYPE = "Almanac";

	private String theme;
	private int numberOfStories;

	public Almanac(int id, String title, int numberOfPages, String theme, int numberOfStories, List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.theme = theme;
		this.numberOfStories = numberOfStories;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getNumberOfStories() {
		return numberOfStories;
	}

	public void setNumberOfStories(int numberOfStories) {
		this.numberOfStories = numberOfStories;
	}

	@Override
	public String toString() {
		return "Almanac: " + super.toString() + ". Theme: " + theme + ", number Of Stories: " + numberOfStories;
	}

}
