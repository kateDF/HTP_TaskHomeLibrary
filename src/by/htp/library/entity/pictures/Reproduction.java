package by.htp.library.entity.pictures;

import java.util.Arrays;
import java.util.List;

import by.htp.library.entity.EntityDB;
import by.htp.library.entity.HasAuthors;
import by.htp.library.entity.LibraryEntity;

public class Reproduction extends EntityDB implements LibraryEntity, HasAuthors {
	public static final String TYPE = "Reproduction";

	private String title;
	private String printingMethod;
	private String material;
	private String size;
	private String author;

	public Reproduction(int id, String title, String author, String material, String size) {
		super(id);
		this.title = title;
		this.material = material;
		this.size = size;
		this.author = author;
	}

	public Reproduction(int id, String title, String author, String printingMethod, String material, String size) {
		this(id, title, author, material, size);
		this.printingMethod = printingMethod;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrintingMethod() {
		return printingMethod;
	}

	public void setPrintingMethod(String printingMethod) {
		this.printingMethod = printingMethod;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Reproduction: " + title + ". Author:" + author + ", printingMethod: " + printingMethod + ". Material: "
				+ material + ", size: " + size;
	}

	@Override
	public List<String> getAuthors() {
		return Arrays.asList(author);
	}

}
