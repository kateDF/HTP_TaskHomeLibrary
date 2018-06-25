package by.htp.library.entity.journal;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.article.Article;

public class Journal extends EntityDB implements LibraryEntity {
	public static final String TYPE = "Journal";

	private String title;
	private int numberOfPages;
	private String periodicity;
	private String subjects;
	private String genre;
	private String format;
	List<Article> articles = new ArrayList();

	public Journal(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.periodicity = periodicity;
		this.subjects = subjects;
		this.genre = genre;
		this.format = format;
	}

	public Journal(int id, String title, int numberOfPages, String periodicity, String subjects, String genre,
			String format, List<Article> articles) {
		super(id);
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.periodicity = periodicity;
		this.subjects = subjects;
		this.genre = genre;
		this.format = format;
		this.articles = articles;
	}

	public int getID() {
		return super.getId();
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

	public String getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public void addArticles(Article article) {
		articles.add(article);
	}

	@Override
	public String toString() {
		return "(Journal): " + title + ", number of pages: " + numberOfPages + ", periodicity: " + periodicity
				+ ", subjects: " + subjects + ", genre: " + genre + ", format: " + format + ". " + articles;
	}

}
