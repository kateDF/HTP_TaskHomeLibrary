package by.htp.library.entity;

public class Ebook implements LibraryEntity {

	private LibraryEntity content;
	private double size;
	private String fileFormat;
	private String fileName;

	public Ebook(LibraryEntity content, double size, String fileFormat, String fileName) {
		this.content = content;
		this.size = size;
		this.fileFormat = fileFormat;
		this.fileName = fileName;
	}

	public LibraryEntity getContent() {
		return content;
	}

	public void setContent(LibraryEntity content) {
		this.content = content;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String getTitle() {
		return content.getTitle();
	}

	@Override
	public String toString() {
		return "Ebook: " + content + ", size: " + size + "kb. File: " + fileName + "." + fileFormat;
	}

}
