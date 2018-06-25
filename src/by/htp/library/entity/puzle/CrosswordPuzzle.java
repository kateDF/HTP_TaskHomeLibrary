package by.htp.library.entity.puzle;

import java.util.Arrays;

public class CrosswordPuzzle extends PrintPuzle {

	private int numberHorizontalWords;
	private int numberVerticalWords;
	private String topic;
	private String[] questions;

	public CrosswordPuzzle(int id, int bookId, String complexity, int numberHorizontalWords, int numberVerticalWords,
			String topic, String... questions) {
		super(id, bookId, complexity);
		this.numberHorizontalWords = numberHorizontalWords;
		this.numberVerticalWords = numberVerticalWords;
		this.topic = topic;
		this.questions = questions;
	}

	public int getNumberHorizontalWords() {
		return numberHorizontalWords;
	}

	public void setNumberHorizontalWords(int numberHorizontalWords) {
		this.numberHorizontalWords = numberHorizontalWords;
	}

	public int getNumberVerticalWords() {
		return numberVerticalWords;
	}

	public void setNumberVerticalWords(int numberVerticalWords) {
		this.numberVerticalWords = numberVerticalWords;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String[] getQuestions() {
		return questions;
	}

	public void setQuestions(String... questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Crossword Puzzle: number of Horizontal Words: " + numberHorizontalWords + ", number of Vertical Words: "
				+ numberVerticalWords + ". Topic=" + topic + ", questions:" + Arrays.toString(questions);
	}

}
