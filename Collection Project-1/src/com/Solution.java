package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(1, "Shekar");
		map.put(2, "Sudeep");
		map.put(3, "Yash");
		Set <Integer> keys=map.keySet();//1,2,3
		for(int key:keys) {
			System.out.println(key+" -> "+map.get(key));
		}
	}
}
