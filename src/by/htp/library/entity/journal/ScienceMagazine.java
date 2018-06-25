package by.htp.library.entity.journal;

import java.util.List;

import by.htp.library.entity.article.Article;

public class ScienceMagazine extends Journal {
	public static final String TYPE = "ScienceMagazine";

	private int issueNumber;
	private String topic;
	private String publishingHouse;

	public ScienceMagazine(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, int issueNumber, String topic, String publishingHouse) {
		super(id, title, numberOfPages, periodicity, subjects, genre, format);
		this.issueNumber = issueNumber;
		this.topic = topic;
		this.publishingHouse = publishingHouse;
	}

	public ScienceMagazine(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, int issueNumber, String topic, String publishingHouse, List<Article> scientificArticles) {
		super(id, title, numberOfPages, periodicity, subjects, genre, format, scientificArticles);
		this.issueNumber = issueNumber;
		this.topic = topic;
		this.publishingHouse = publishingHouse;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	@Override
	public String toString() {
		return "Science Magazine " + super.toString() + ". Issues number: " + issueNumber + ", topic: " + topic
				+ ". Publishing House: " + publishingHouse;
	}

}
