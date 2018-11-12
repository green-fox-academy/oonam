package com.gfaw04d1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
	public static void main(String[] args) {
		String myPath = "my-file2.txt";
		String myWord = "apple";
		int myNum = 5;

		myParams(myPath, myWord, myNum);
	}

	public static void myParams(String myPath, String myWord, int myNum) {
		List<String> content = new ArrayList();

		for (int i = 0; i < myNum; i++) {
			content.add(myWord);
		}

		try {
			Path filePath = Paths.get(myPath);
			Files.write(filePath, content);
			System.out.println("megcsinaltam");
		} catch (Exception e) {
			System.out.println("Unable to write file: my-file.txt");
		}
	}
}
