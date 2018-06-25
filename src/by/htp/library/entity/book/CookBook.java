package by.htp.library.entity.book;

import java.util.List;

public class CookBook extends Book {
	public static final String TYPE = "CookBook";

	private int numberOfRecipes;
	private String type;
	private String ingredients;

	public CookBook(int id, String title, int numberOfPages, int numberOfRecipes, String type, String ingredients,
			List<String> authors) {
		super(id, title, numberOfPages, authors);
		this.numberOfRecipes = numberOfRecipes;
		this.type = type;
		this.ingredients = ingredients;
	}

	public int getNumberOfRecipes() {
		return numberOfRecipes;
	}

	public void setNumberOfRecipes(int numberOfRecipes) {
		this.numberOfRecipes = numberOfRecipes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Cook Book: " + super.toString() + ", number Of Recipes: " + numberOfRecipes + ". Type: " + type
				+ ", ingredients: " + ingredients;
	}

}
