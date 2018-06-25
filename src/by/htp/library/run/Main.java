package by.htp.library.run;

import java.util.List;

import by.htp.library.entity.LibraryEntity;
import by.htp.library.logic.Librarian;

public class Main {

	public static void main(String[] args) {

		Librarian.showLibrary();

		String author = "Paul Ducan";
		List<LibraryEntity> booksByAuthor = Librarian.searchByAuthors(author);
		System.out.println("\nBooks by " + author + ":");
		Librarian.showBooks(booksByAuthor);

		System.out.println("\nEbooks by " + author + ":");
		Librarian.showBooks(Librarian.searchEbookByAuthor(author));
	}

}
