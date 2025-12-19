package com.deloitte.demo.day4.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		System.out.println(list.size());
		list.add("Sonu");
		list.add("Monu");
		list.add("Tonu");
		System.out.println(list);
		list.add(1, "Ponu");
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Soni");
		list2.add("Moni");

		list.addAll(list2);
		System.out.println(list);

        for(String it:list){
            System.out.println(it);
        }
        System.out.println("--------------using foreach ---------");
        list.forEach(it->System.out.println(it));

        System.out.println("--------------tradidtional for loop ---------");
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        

	}

}
