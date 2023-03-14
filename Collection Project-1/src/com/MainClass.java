package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Map<String,Double> map=new LinkedHashMap();
		map.put("tom", 2.5);
		map.put("Jerry", 3.5);
		map.put("TunTunAunty", 2.7);
		map.put("ChotaBheem", 4.8);
		map.put("Kaliya", 5.6);
		Set<String> names=map.keySet();
		for(String name:names) {
			System.out.println(name+"->"+map.get(name));
		}
		System.out.println("-----2.5 or above-----");
		for(String name:names) {
			if(map.get(name)>2.5) {
				System.out.println(name+"->"+map.get(name));				
			}
		}
		
	}
}
