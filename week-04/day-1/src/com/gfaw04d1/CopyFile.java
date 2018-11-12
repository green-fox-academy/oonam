package com.gfaw04d1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) {
		String filenameIn = "my-file2.txt";
		String filenameOut = "my-fileOut.txt";

		copyAFile(filenameIn, filenameOut);
	}

	public static void copyAFile(String filenameIn, String filenameOut) {
		List<String> lines = new ArrayList();

		try {
			Path fNameIn = Paths.get(filenameIn);
			lines = Files.readAllLines(fNameIn);
			System.out.println("Input: " + lines);
		} catch (Exception e) {
			System.out.println("Unaccessible path");
		}

		try {
			Path fNameOut = Paths.get(filenameOut);
			Files.write(fNameOut, lines);
//			if (lines == Files.readAllLines(fNameOut)) {
//				System.out.println(true);
//				System.out.print("Output: " + Files.readAllLines(fNameOut));
//			} else {
//				System.out.println(false);
//			}
			System.out.print("Output: " + Files.readAllLines(fNameOut));
		} catch (Exception e) {
			System.out.println("Unable to write file: my-file.txt");
		}
	}
}
