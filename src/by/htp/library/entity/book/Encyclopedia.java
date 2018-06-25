package by.htp.library.entity.book;

import java.util.List;

public class Encyclopedia extends Book {
	public static final String TYPE = "Encyclopedia";

	private String title;
	private String branch;
	private String targetAudience;
	private int volume;

	public Encyclopedia(int id, String title, int numberOfPages, String branch, String targetAudience, int volume,
			List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.branch = branch;
		this.targetAudience = targetAudience;
		this.volume = volume;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Encyclopedia: " + super.toString() + ", branch: " + branch + ". Target Audience: " + targetAudience
				+ ", volume: " + volume;
	}

}
