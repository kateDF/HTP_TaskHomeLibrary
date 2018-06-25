package by.htp.library.entity.puzle;

public class ScanWords extends PrintPuzle {

	private int numberOfWords;
	private String publishingHouse;
	private boolean questionsWithPictire;

	public ScanWords(int id, int bookId, String complexity, int numberOfWords, String publishingHouse,
			boolean questionsWithPictire) {
		super(id, bookId, complexity);
		this.numberOfWords = numberOfWords;
		this.publishingHouse = publishingHouse;
		this.questionsWithPictire = questionsWithPictire;
	}

	public int getNumberOfWords() {
		return numberOfWords;
	}

	public void setNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public boolean isQuestionsWithPictire() {
		return questionsWithPictire;
	}

	public void setQuestionsWithPictire(boolean questionsWithPictire) {
		this.questionsWithPictire = questionsWithPictire;
	}

	@Override
	public String toString() {
		return "ScanWords number Of Words: " + numberOfWords + ", publishingHouse=" + publishingHouse
				+ ". Questions With Pictires: " + questionsWithPictire;
	}

}
