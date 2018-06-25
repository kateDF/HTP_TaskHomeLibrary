package by.htp.library.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.htp.library.entity.Ebook;
import by.htp.library.entity.EntityDB;
import by.htp.library.entity.LibraryEntity;
import by.htp.library.entity.album.Album;
import by.htp.library.entity.book.Almanac;
import by.htp.library.entity.book.Book;
import by.htp.library.entity.book.ChildrenBook;
import by.htp.library.entity.book.CookBook;
import by.htp.library.entity.book.Encyclopedia;
import by.htp.library.entity.book.Instructions;
import by.htp.library.entity.book.LiteraryCollection;
import by.htp.library.entity.book.Manuscript;
import by.htp.library.entity.book.ReferenceWork;
import by.htp.library.entity.book.TextBook;
import by.htp.library.entity.book.ToyBook;
import by.htp.library.entity.document.TaxReturn;
import by.htp.library.entity.journal.Comics;
import by.htp.library.entity.journal.Journal;
import by.htp.library.entity.journal.ScienceMagazine;
import by.htp.library.entity.journal.Yearbook;
import by.htp.library.entity.newspaper.Newspaper;
import by.htp.library.entity.pictures.Reproduction;
import by.htp.library.entity.promotion.Brochure;

public class BookFileScanner {
	public static final String FILE_BOOK = "database/books.txt";
	public static final String FILE_ARTICLES = "database/articles.txt";
	public static final String BOOK_FIELDS_DELIMETER = "/";
	public static final String AUTHOR_NAMES_DELIMETER = ",";
	public static final String EBOOK_MARKER = "ebook";
	public static final String UNKNOWN_AUTHOR = "Unknown";

	public static Map<Integer, LibraryEntity> readBooks() {
		List<String> booksAsString = FileScanner.readFileByLines(FILE_BOOK);
		Map<Integer, LibraryEntity> books = new HashMap<>();

		for (int i = 0; i < booksAsString.size(); i++) {

			String[] fields = booksAsString.get(i).split(BOOK_FIELDS_DELIMETER);
			LibraryEntity entity = null;

			// TODO add constants
			switch (fields[0]) {
			case Book.TYPE:
				entity = createBook(fields);
				break;
			case CookBook.TYPE:
				entity = createCookBook(fields);
				break;
			case Encyclopedia.TYPE:
				entity = createEncyclopedia(fields);
				break;
			case Journal.TYPE:
				entity = createJournal(fields);
				break;
			case TextBook.TYPE:
				entity = createTextBook(fields);
				break;
			case Almanac.TYPE:
				entity = createAlmanac(fields);
				break;
			case ChildrenBook.TYPE:
				entity = createChildrenBook(fields);
				break;
			case Instructions.TYPE:
				entity = createInstructions(fields);
				break;
			case Yearbook.TYPE:
				entity = createYearbook(fields);
				break;
			case ScienceMagazine.TYPE:
				entity = createScienceMagazine(fields);
				break;
			case Comics.TYPE:
				entity = createComics(fields);
				break;
			case LiteraryCollection.TYPE:
				entity = createLiteraryCollection(fields);
				break;
			case Manuscript.TYPE:
				entity = createManuscript(fields);
				break;
			case ReferenceWork.TYPE:
				entity = createReferenceWork(fields);
				break;
			case ToyBook.TYPE:
				entity = createToyBook(fields);
				break;
			case Album.TYPE:
				entity = createAlbum(fields);
				break;
			case TaxReturn.TYPE:
				entity = createTaxReturn(fields);
				break;
			case Newspaper.TYPE:
				entity = createNewspaper(fields);
				break;
			case Reproduction.TYPE:
				entity = createReproduction(fields);
				break;
			case Brochure.TYPE:
				entity = createBrochure(fields);
				break;
			}

			books.put(getId(entity), entity);
		}
		return books;
	}

	public static void showFullListOfBooks(String file) {
		List<String> allBooks = FileScanner.readFileByLines(file);
		for (int i = 0; i < allBooks.size(); i++) {
			System.out.println(allBooks.get(i));
			System.out.println();
		}
	}

	private static LibraryEntity createBook(String... fields) {
		List<String> authors = createAuthorsArr(fields[5]);
		Book content = new Book(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[6]), fields[7], fields[8]);
		}
		return content;
	}

	private static LibraryEntity createCookBook(String... fields) {
		CookBook content = new CookBook(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				Integer.valueOf(fields[5]), fields[6], fields[7], Arrays.asList(fields[8]));
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createEncyclopedia(String... fields) {
		List<String> authors = createAuthorsArr(fields[8]);
		Encyclopedia content = new Encyclopedia(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], fields[6], Integer.valueOf(fields[7]), authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createJournal(String... fields) {
		Journal content = new Journal(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], fields[7], fields[8]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createTextBook(String... fields) {
		List<String> authors = createAuthorsArr(fields[6]);
		TextBook content = new TextBook(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[7]), fields[8], fields[9]);
		}
		return content;
	}

	private static LibraryEntity createAlmanac(String... fields) {
		List<String> authors = createAuthorsArr(fields[7]);
		Almanac content = new Almanac(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				Integer.valueOf(fields[6]), authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[8]), fields[9], fields[10]);
		}
		return content;
	}

	private static LibraryEntity createChildrenBook(String... fields) {
		List<String> authors = createAuthorsArr(fields[8]);
		ChildrenBook content = new ChildrenBook(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], fields[6], fields[7], authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createInstructions(String... fields) {
		List<String> authors = createAuthorsArr(fields[6]);
		Instructions content = new Instructions(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[7]), fields[8], fields[9]);
		}
		return content;
	}

	private static LibraryEntity createYearbook(String... fields) {
		Yearbook content = new Yearbook(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], fields[7], fields[8], Integer.valueOf(fields[9]), fields[10]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[11]), fields[12], fields[13]);
		}
		return content;
	}

	private static LibraryEntity createScienceMagazine(String... fields) {
		ScienceMagazine content = new ScienceMagazine(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], fields[6], fields[7], fields[8], Integer.valueOf(fields[9]), fields[10], fields[11]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[12]), fields[13], fields[14]);
		}
		return content;
	}

	private static LibraryEntity createComics(String... fields) {
		Comics content = new Comics(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], fields[7], fields[8], fields[9], fields[10], fields[11], fields[12]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[13]), fields[14], fields[15]);
		}
		return content;
	}

	private static LibraryEntity createLiteraryCollection(String... fields) {
		List<String> authors = createAuthorsArr(fields[8]);
		LiteraryCollection content = new LiteraryCollection(Integer.valueOf(fields[2]), fields[3],
				Integer.valueOf(fields[4]), fields[5], fields[6], fields[7], authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createManuscript(String... fields) {
		Manuscript content = new Manuscript(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], fields[6], fields[7], Arrays.asList(fields[8]));
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createReferenceWork(String... fields) {
		List<String> authors = createAuthorsArr(fields[8]);
		ReferenceWork content = new ReferenceWork(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				fields[5], fields[6], fields[7], authors);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createAlbum(String... fields) {
		Album content = new Album(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], Integer.valueOf(fields[7]));
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[8]), fields[9], fields[10]);
		}
		return content;
	}

	private static LibraryEntity createToyBook(String... fields) {
		ToyBook content = new ToyBook(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]),
				Arrays.asList(fields[5]), fields[6], fields[7], fields[8], fields[9]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[10]), fields[11], fields[12]);
		}
		return content;
	}

	private static LibraryEntity createTaxReturn(String... fields) {
		TaxReturn content = new TaxReturn(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], fields[7], Integer.valueOf(fields[8]));
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[9]), fields[10], fields[11]);
		}
		return content;
	}

	private static LibraryEntity createNewspaper(String... fields) {
		boolean isPaid = Boolean.parseBoolean(fields[7]);
		Newspaper content = new Newspaper(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6], isPaid);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[8]), fields[9], fields[10]);
		}
		return content;
	}

	private static LibraryEntity createReproduction(String... fields) {
		Reproduction content = new Reproduction(Integer.valueOf(fields[2]), fields[3], fields[4], fields[5], fields[6]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[7]), fields[8], fields[9]);
		}
		return content;
	}

	private static LibraryEntity createBrochure(String... fields) {
		Brochure content = new Brochure(Integer.valueOf(fields[2]), fields[3], Integer.valueOf(fields[4]), fields[5],
				fields[6]);
		if (fields[1].equals(EBOOK_MARKER)) {
			return new Ebook(content, Double.valueOf(fields[7]), fields[8], fields[9]);
		}
		return content;
	}

	private static List<String> createAuthorsArr(String authors) {
		List<String> authorsArray = new ArrayList();
		if (authors == null) {
			authorsArray.add(UNKNOWN_AUTHOR);
		} else {
			// authorsArray.addAll(Arrays.asList(authors.split(AUTHOR_NAMES_DELIMETER)));
			Collections.addAll(authorsArray, authors.split(AUTHOR_NAMES_DELIMETER));
		}
		return authorsArray;
	}

	private static int getId(LibraryEntity entity) {
		int id = 0;
		if (entity instanceof Ebook) {
			id = ((EntityDB) ((Ebook) entity).getContent()).getId();
		} else {
			id = ((EntityDB) entity).getId();
		}
		return id;
	}

}
