package by.htp.library.entity.journal;

public class Comics extends Journal {
	public static final String TYPE = "Comics";

	private String author;
	private String plot;
	private String univers;
	private String superhero;

	public Comics(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, String author, String plot, String univers, String superhero) {
		super(id, title, numberOfPages, periodicity, subjects, genre, format);
		this.author = author;
		this.plot = plot;
		this.univers = univers;
		this.superhero = superhero;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getUnivers() {
		return univers;
	}

	public void setUnivers(String univers) {
		this.univers = univers;
	}

	public String getSuperhero() {
		return superhero;
	}

	public void setSuperhero(String superhero) {
		this.superhero = superhero;
	}

	@Override
	public String toString() {
		return "Comics " + super.toString() + ", author: " + author + ", univers " + univers + ". Plot: " + plot
				+ ". Superhero:" + superhero;
	}

}
