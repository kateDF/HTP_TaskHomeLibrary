package by.htp.library.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.entity.article.Article;
import by.htp.library.entity.article.ScientificArticle;

public class ArticleFileScanner {
	public static final String FILE_ARTICLES = "database/articles.txt";
	public static final String ARTICLE_FIELDS_DELIMETER = "/";

	public static List<Article> readArticles() {
		List<String> articlesAsString = FileScanner.readFileByLines(FILE_ARTICLES);
		List<Article> articles = new ArrayList<>();

		for (int i = 0; i < articlesAsString.size(); i++) {

			String[] fields = articlesAsString.get(i).split(ARTICLE_FIELDS_DELIMETER);
			articles.add(createArticle(fields));
		}
		return articles;
	}

	private static Article createArticle(String... fields) {
		Article content = null;
		if (fields[0].equals(Article.TYPE)) {
			content = new Article(Integer.valueOf(fields[1]), Integer.valueOf(fields[2]), fields[3], fields[4],
					Integer.valueOf(fields[5]), fields[6]);
		} else if (fields[0].equals(ScientificArticle.TYPE)) {
			content = new ScientificArticle(Integer.valueOf(fields[1]), Integer.valueOf(fields[2]), fields[3],
					fields[4], Integer.valueOf(fields[5]), fields[6], fields[7], fields[8]);
		}
		return content;
	}
}
