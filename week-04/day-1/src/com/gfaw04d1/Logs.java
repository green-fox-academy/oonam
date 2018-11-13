package com.gfaw04d1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Logs {
	public static void main(String[] args) {
		String url = "https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/file-manipulations/logs/log.txt";
		String filename = "log.txt";

		copyLogTxt(url, filename);
		ipAdresses(filename);
	}

	public static String ipAdresses(String localLogPath) {
		List<String> lines = new ArrayList();

		try {
			Path path = Paths.get(localLogPath);
			lines = Files.readAllLines(path);
		} catch (Exception e) {
			System.out.println("Cant read the file.");
		}

		String ip = lines.substring(27, 38);
	}

	public static boolean copyLogTxt(String filenameIn, String filenameOut) {
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
