package by.htp.library.entity.promotion;

public class Brochure extends PromotionalItem {
	public static final String TYPE = "Brochure";

	private String circulation;

	public Brochure(int id, String title, int numberOfPages, String format, String circulation) {
		super(id, title, format, numberOfPages);
		this.circulation = circulation;
	}

	public String getCirculation() {
		return circulation;
	}

	public void setCirculation(String circulation) {
		this.circulation = circulation;
	}

	@Override
	public String toString() {
		return "Brochure: " + super.toString() + ". Circulation: " + circulation;
	}

}
