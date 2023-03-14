package com;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(20,"Tom");
		Student s2=new Student(22,"Jerry");
		Student s3=new Student(24,"ChotaBheem");
		Map <Integer,Student> map=new LinkedHashMap<Integer,Student>();
		map.put(101, s1);//map.put(101,new Student(20,"Tom");
		map.put(102, s2);//map.put(102,new Student(22,"Jerry");
		map.put(103, s3);//map.put(103,new Student(24,"ChotaBheem");
		//Converting the map into set which stores only keys using keySet();
		Set<Integer> keys=map.keySet();
		//creating Instance of ArrayList and upcasting it to List with generic type Student
		List<Student> list=new ArrayList<Student>();
		//Traversing Entries
		for(int key:keys)
		{
			Student std=map.get(key);
			list.add(std);
			System.out.println(std);
		}
	}
}
