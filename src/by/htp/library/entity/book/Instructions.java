package by.htp.library.entity.book;

import java.util.List;

public class Instructions extends Book {
	public static final String TYPE = "Instructions";

	private String subject;
	private String rules;

	public Instructions(int id, String title, int numberOfPages, String subject, List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.subject = subject;
	}

	public Instructions(int id, String title, int numberOfPages, String subject, String rules, List<String> authors) {
		this(id, title, numberOfPages, subject, authors);
		this.rules = rules;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		return "Instructions: " + super.toString() + ". Subject: " + subject + ", rules: " + rules;
	}

}
