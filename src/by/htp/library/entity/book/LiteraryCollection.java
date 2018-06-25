package by.htp.library.entity.book;

import java.util.List;

public class LiteraryCollection extends Book {
	public static final String TYPE = "LiteraryCollection";

	private String publisher;
	private String topic;
	private String literaryType;

	public LiteraryCollection(int id, String title, int numberOfPages, String publisher, String topic,
			String literaryType, List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.publisher = publisher;
		this.topic = topic;
		this.literaryType = literaryType;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLiteraryType() {
		return literaryType;
	}

	public void setLiteraryType(String literaryType) {
		this.literaryType = literaryType;
	}

	@Override
	public String toString() {
		return "Literary Collection: " + super.toString() + ". Publisher: " + publisher + ", topic: " + topic
				+ ", literary Type: " + literaryType;
	}

}
