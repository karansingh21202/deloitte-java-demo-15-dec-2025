package com.deloitte.demo.day4.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> stateCodes = new HashMap<>();

		stateCodes.put("AP", "Andhra Pradesh");
		stateCodes.put("TS", "Telangana"); // duplicate value
		stateCodes.put("MH", "Maharashtra2"); // duplicate key
		stateCodes.put("ZZ", null);
		stateCodes.put("XX", null);
		stateCodes.put(null, "Bharat"); // one null key is possible
		System.out.println(stateCodes);
		System.out.println(stateCodes.keySet());
		System.out.println(stateCodes.values());
		System.out.println(stateCodes.containsKey("MH"));
		System.out.println(stateCodes.get("AP"));

		// find and use other methods 
		System.out.println(stateCodes.get("AP"));
		stateCodes.replace("AP", "Andhra");
		System.out.println(stateCodes.size());
		System.out.println(stateCodes.isEmpty());
		System.out.println(stateCodes.containsValue("Telangana"));
		stateCodes.remove("ZZ");

		System.out.println(stateCodes);
//		stateCodes.clear();
//		System.out.println(stateCodes);

	}

}
