//package com.gfaw04d1;
//
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//import java.util.*;
//
//public class Logs {
//	public static void main(String[] args) {
//		String filename = "log.txt";
//		List<String> lines = new ArrayList();
//		List<String> ipList = new ArrayList();
//		List<String> uniqueIpList = new ArrayList();
//
//		lines = readLinesFromFile(filename, lines);
//		ipList = writeIpAddressesToList(lines, ipList);
////		uniqueIpList = uniqueIpAddresses(ipList, uniqueIpList);
//
////		for (String element : ipList) {
////			System.out.println(element);
////		}
//	}
//
//	public static List<String> readLinesFromFile(String filename, List<String> lines){
//		try {
//			Path path = Paths.get(filename);
//			lines = Files.readAllLines(path);
//		} catch (Exception e) {
//			System.out.println("Cant read the file.");
//		}
//		return lines;
//	}
//
//	public static List<String> writeIpAddressesToList(List<String> lines, List<String> ipList) {
//		for (String ips : lines) {
//			ipList.add(ips.substring(27, 38));
//		}
//		return ipList;
//	}
//
//	public static Set<String> uniqueIpAddresses(List<String> ipList, List<String> uniqueIpList) {
//
//
////		return uniqueIpList;
//	}
//}
