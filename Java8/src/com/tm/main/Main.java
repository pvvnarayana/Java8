package com.tm.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.tm.model.Employee;

public class Main {
	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<Employee, String>();
		Employee e1 = new Employee(106, "AAAA", 20, 2000);
		Employee e2 = new Employee(102, "BBBB", 34, 2000);
		Employee e3 = new Employee(103, "CCCC", 23, 2000);
		Employee e4 = new Employee(101, "DDDD", 45, 2000);
		Employee e5 = new Employee(105, "EEEE", 32, 2000);

		map.put(e3, "CCCC");
		map.put(e4, "DDDD");
		map.put(e5, "EEEE");
		map.put(e2, "BBBB");
		map.put(e1, "AAAA");

		map.entrySet().stream().forEach(System.out::println);

		TreeMap<Employee, String> tmap = new TreeMap<Employee, String>(new Employee.AgeComparator());
		tmap.putAll(map);
		System.out.println("Sort by AGE");
		tmap.entrySet().stream().forEach(System.out::println);

		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 2, 4, 2, 5, 2, 5, 4);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			int e = it.next();
			System.out.println(e);
			if (e == 4)
				it.remove();
		}

		System.out.println(list);

		CopyOnWriteArrayList<Integer> list2 = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		Iterator itr = list2.iterator();
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			System.out.println(no);
			if (no == 3)
				list2.add(14);
		}
		
		System.out.println(list2);
	}

}
