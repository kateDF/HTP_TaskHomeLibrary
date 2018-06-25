package by.htp.library.entity.article;

public class ScientificArticle extends Article {
	public static final String TYPE = "ScientificArticle";

	private String topic;
	private String sphere;

	public ScientificArticle(int id, int bookId, String title, String author, int yearOfPublication, String language,
			String topic, String sphere) {
		super(id, bookId, title, author, yearOfPublication, language);
		this.topic = topic;
		this.sphere = sphere;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSphere() {
		return sphere;
	}

	public void setSphere(String sphere) {
		this.sphere = sphere;
	}

	@Override
	public String toString() {
		return "Scientific " + super.toString() + ". Topic: " + topic + ", sphere: " + sphere;
	}

}
