package by.htp.library.entity.journal;

import java.util.List;

import by.htp.library.entity.article.Article;

public class Yearbook extends Journal {
	public static final String TYPE = "Yearbook";

	private int yearOfIssue;
	private String topic;

	public Yearbook(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, int yearOfIssue, String topic) {
		super(id, title, numberOfPages, periodicity, subjects, genre, format);
		this.yearOfIssue = yearOfIssue;
		this.topic = topic;
	}

	public Yearbook(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, int yearOfIssue, String topic, List<Article> articles) {
		super(id, title, numberOfPages, periodicity, subjects, genre, format, articles);
		this.yearOfIssue = yearOfIssue;
		this.topic = topic;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Yearbook " + super.toString() + ". Óear Of Issue" + yearOfIssue + ", topic: " + topic;
	}

}
