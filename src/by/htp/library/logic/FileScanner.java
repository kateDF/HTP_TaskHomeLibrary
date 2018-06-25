package by.htp.library.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

	private FileScanner() {

	}

	protected static List<String> readFileByLines(String file) {
		List<String> contents = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {

			String line = reader.readLine();

			while (line != null) {
				contents.add(line);
				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return contents;
	}

}
