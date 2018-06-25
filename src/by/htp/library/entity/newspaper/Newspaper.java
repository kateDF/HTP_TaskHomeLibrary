package by.htp.library.entity.newspaper;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.newspaper.schedules.SchedulesOfTelecasts;

public class Newspaper extends EntityDB implements LibraryEntity {
	public static final String TYPE = "Newspaper";

	private String title;
	private int numberOfPages;
	private String editor;
	private String periodicity;
	private boolean isPaid;
	private SchedulesOfTelecasts[] schedulesOfTelecasts;

	public Newspaper(int id, String title, int numberOfPages, String editor, String periodicity, boolean isPaid,
			SchedulesOfTelecasts... schedulesOfTelecasts) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.editor = editor;
		this.periodicity = periodicity;
		this.isPaid = isPaid;
		this.schedulesOfTelecasts = schedulesOfTelecasts;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public SchedulesOfTelecasts[] getSchedulesOfTelecasts() {
		return schedulesOfTelecasts;
	}

	public void setSchedulesOfTelecasts(SchedulesOfTelecasts... schedulesOfTelecasts) {
		this.schedulesOfTelecasts = schedulesOfTelecasts;
	}

	@Override
	public String toString() {
		return "Newspaper: " + title + ", editor: " + editor + ". Periodicity: " + periodicity + ", is paid: " + isPaid;
	}

}
