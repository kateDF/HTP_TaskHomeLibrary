package by.htp.library.entity.document;

public class TaxReturn extends Document {
	public static final String TYPE = "TaxReturn";

	private String country;
	private String taxpayer;
	private String typeOfTaxReturn;
	private int yearOfDeclaration;

	public TaxReturn(int id, String title, int numberOfPages, String country, String taxpayer, String typeOfTaxReturn,
			int yearOfDeclaration) {
		super(id, title, numberOfPages);
		this.country = country;
		this.taxpayer = taxpayer;
		this.typeOfTaxReturn = typeOfTaxReturn;
		this.yearOfDeclaration = yearOfDeclaration;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTaxpayer() {
		return taxpayer;
	}

	public void setTaxpayer(String taxpayer) {
		this.taxpayer = taxpayer;
	}

	public String getTypeOfTaxReturn() {
		return typeOfTaxReturn;
	}

	public void setTypeOfTaxReturn(String typeOfTaxReturn) {
		this.typeOfTaxReturn = typeOfTaxReturn;
	}

	public int getYearOfDeclaration() {
		return yearOfDeclaration;
	}

	public void setYearOfDeclaration(int yearOfDeclaration) {
		this.yearOfDeclaration = yearOfDeclaration;
	}

	@Override
	public String toString() {
		return super.toString() + ". Country: " + country + ", taxpayer: " + taxpayer + ". Type Of Tax Return: "
				+ typeOfTaxReturn + ", year Of Declaration: " + yearOfDeclaration;
	}

}
