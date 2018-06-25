package by.htp.library.entity.book;

import java.util.List;

public class Manuscript extends Book {
	public static final String TYPE = "Manuscript";

	private String dateOfCreation;
	private String placeOfCreation;
	private String form;

	public Manuscript(int id, String title, int numberOfPages, String dateOfCreation, String placeOfCreation,
			String form, List<String> author) {
		super(id, title, numberOfPages, author);
		this.dateOfCreation = dateOfCreation;
		this.placeOfCreation = placeOfCreation;
		this.form = form;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getPlaceOfCreation() {
		return placeOfCreation;
	}

	public void setPlaceOfCreation(String placeOfCreation) {
		this.placeOfCreation = placeOfCreation;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@Override
	public String toString() {
		return "Manuscript: " + super.toString() + ". Date Of Creation: " + dateOfCreation + ", place Of Creation: "
				+ placeOfCreation + ". Form: " + form;
	}

}
