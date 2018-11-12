package com.gfaw04d1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) {
		String filenameIn = "my-file2.txt";
		String filenameOut = "my-fileOut2.txt";

		System.out.println(copyAFile(filenameIn, filenameOut));
	}

	public static boolean copyAFile(String filenameIn, String filenameOut) {
		List<String> lines = new ArrayList();

		try {
			Path fNameIn = Paths.get(filenameIn);
			Path fNameOut = Paths.get(filenameOut);
			lines = Files.readAllLines(fNameIn);
			Files.write(fNameOut, lines);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
