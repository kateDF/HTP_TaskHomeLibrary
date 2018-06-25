package by.htp.library.entity.puzle;

public class ColoringPages extends PrintPuzle {

	private String title;
	private String kind;
	private int numberOfPages;

	public ColoringPages(int id, int bookId, String complexity, String title, String kind, int numberOfPages) {
		super(id, bookId, complexity);
		this.title = title;
		this.kind = kind;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Coloring Pages: " + title + ", kind: " + kind + ", number of pages: " + numberOfPages;
	}

}
