package by.htp.library.entity.puzle;

public class Sudoku extends PrintPuzle {

	private String size;
	private String rules;
	private String algorithm;

	public Sudoku(int id, int bookId, String complexity, String size, String rules, String algorithm) {
		super(id, bookId, complexity);
		this.size = size;
		this.rules = rules;
		this.algorithm = algorithm;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	@Override
	public String toString() {
		return "Sudoku size: " + size + ". Rules: " + rules + "Algorithm: " + algorithm;
	}

}
