package com.gfaw04d1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CountLines {
	public static void main(String[] args) {
		filename();
	}

	public static void filename() {
		Scanner scanner	= new Scanner(System.in);
		System.out.println("Pls, give me a filename: ");
		String input = scanner.nextLine();

		try {
			Path filePath = Paths.get(input);
			long lineCount = Files.lines(filePath).count();
			List<String> lines = Files.readAllLines(filePath);
			System.out.println(lineCount);
		} catch (Exception e) {
			System.out.println(0);
		}
	}
}