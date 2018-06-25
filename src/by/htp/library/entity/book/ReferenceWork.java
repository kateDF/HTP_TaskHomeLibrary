package by.htp.library.entity.book;

import java.util.List;

public class ReferenceWork extends Book {
	public static final String TYPE = "ReferenceWork";

	private String classification;
	private String topic;
	private String language;

	public ReferenceWork(int id, String title, int numberOfPages, String classification, String topic, String language,
			List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.classification = classification;
		this.topic = topic;
		this.language = language;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ReferenceWork " + super.toString() + ". Classification: " + classification + ", topic: " + topic
				+ ", language: " + language;
	}

}
