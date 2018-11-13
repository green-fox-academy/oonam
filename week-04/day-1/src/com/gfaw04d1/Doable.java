package com.gfaw04d1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Doable {
	public static void main(String[] args) {
		ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

		Map<String, Object> tree0 = new HashMap<String, Object>();
		tree0.put("type", "oak");
		tree0.put("leaf color", "red");
		tree0.put("age", 2);
		tree0.put("sex", "F");
		map.add( tree0 );

		Map<String, Object> tree1 = new HashMap<String, Object>();
		tree1.put("type", "ash");
		tree1.put("leaf color", "green");
		tree1.put("age", 5);
		tree1.put("sex", "F");
		map.add( tree1 );

		Map<String, Object> tree2 = new HashMap<String, Object>();
		tree2.put("type", "cedar");
		tree2.put("leaf color", "orange");
		tree2.put("age", 8);
		tree2.put("sex", "M");
		map.add( tree2 );

		Map<String, Object> tree3 = new HashMap<String, Object>();
		tree3.put("type", "maple");
		tree3.put("leaf color", "white");
		tree3.put("age", 1);
		tree3.put("sex", "M");
		map.add( tree3 );

		Map<String, Object> tree4 = new HashMap<String, Object>();
		tree4.put("type", "pine");
		tree4.put("leaf color", "black");
		tree4.put("age", 3);
		tree4.put("sex", "F");
		map.add( tree4 );
	}
}
