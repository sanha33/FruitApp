package com.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(1,"사과",2300);
		fl.add(s1);
		Fruit s2= new Fruit(1,"메론",23800);
		fl.add(s2);
		Fruit s3 = new Fruit(1,"수박",2800);
		fl.add(s3);
		Fruit s4 = new Fruit(1,"바나나",7700);
		fl.add(s4);
		Fruit s5 = new Fruit(1,"딸기",6800);
		fl.add(s5);
		Fruit s6 = new Fruit(1,"복숭아",8800);
		fl.add(s6);
		Fruit s7 = new Fruit(1,"체리",5600);
		fl.add(s7);
		Fruit s8 = new Fruit(1,"레몬",12300);
		fl.add(s8);
		Fruit s9 = new Fruit(1,"오렌지",9300);
		fl.add(s9);
		Fruit s10 = new Fruit(1,"자두",2500);
		fl.add(s10);
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s :fl) {
			System.out.println(s.toString());
		}

		System.out.println("Student List(reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
	//		System.out.println(s.getNo()+s.getName()+s.getAge());
		
		}
	}

}
