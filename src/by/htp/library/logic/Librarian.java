package by.htp.library.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import by.htp.library.entity.Ebook;
import by.htp.library.entity.HasAuthors;
import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.article.Article;
import by.htp.library.entity.journal.Journal;

public class Librarian {

	public static void showLibrary() {
		Map<Integer, LibraryEntity> library = linkedBooksAndArticles();
		int i = 1;
		for (int key : library.keySet()) {
			System.out.print(i + ". ");
			System.out.println(library.get(key));
			i++;
		}
	}

	public static void showBooks(Map<Integer, LibraryEntity> allBooks) {
		showBooks(allBooks.values());
	}

	public static void showBooks(Collection<LibraryEntity> allBooks) {
		for (LibraryEntity book : allBooks) {
			System.out.println(book);
		}
	}

	public static List<LibraryEntity> searchByAuthors(String author) {
		Map<Integer, LibraryEntity> books = linkedBooksAndArticles();
		List<LibraryEntity> booksByAuthor = new ArrayList<>();

		for (Entry<Integer, LibraryEntity> entry : books.entrySet()) {
			LibraryEntity book = entry.getValue();
			if (book instanceof Ebook) {
				book = ((Ebook) book).getContent();
			}
			if (book instanceof HasAuthors) {
				if (((HasAuthors) book).getAuthors().contains(author)) {
					booksByAuthor.add(entry.getValue());
				}
			}
		}
		return booksByAuthor;
	}

	public static Map<Integer, LibraryEntity> searchEbookByAuthor(String author) {
		Map<Integer, LibraryEntity> books = linkedBooksAndArticles();
		Map<Integer, LibraryEntity> ebooksByAuthor = new HashMap<>();

		for (int key : books.keySet()) {
			LibraryEntity book = books.get(key);
			if (book instanceof Ebook) {
				book = ((Ebook) book).getContent();
				if (book instanceof HasAuthors && ((HasAuthors) book).getAuthors().contains(author)) {
					ebooksByAuthor.put(key, books.get(key));
				}
			}
		}
		return ebooksByAuthor;
	}

	public static Map<Integer, LibraryEntity> linkedBooksAndArticles() {
		Map<Integer, LibraryEntity> allBooks = BookFileScanner.readBooks();
		List<Article> allArticles = ArticleFileScanner.readArticles();

		for (Article article : allArticles) {
			LibraryEntity book = allBooks.get(article.getBookId());
			if (book instanceof Ebook && ((Ebook) book).getContent() instanceof Journal) {
				((Journal) ((Ebook) book).getContent()).addArticles(article);
			} else if (book instanceof Journal) {
				((Journal) book).addArticles(article);
			}
		}
		return allBooks;
	}

}
