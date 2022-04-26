package com.abc.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		//data source
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("sql");
		list.add("jpa");
		list.add("devops");
		
		//get stream object from collection
		
		//Stream<String> stream = list.stream();		
		//stream.forEach(x->System.out.println(x));
		
		list.stream().forEach(x->System.out.println(x));
		
		//data source
		Integer[] arys = new Integer[5];
		arys[0] = 20;
		arys[1] = 10;
		arys[2] = 45;
		arys[3] = 36;
		arys[4] = 28;
		

		//get stream obj from array
		
        //Stream<Integer> aryStream = Arrays.stream(arys);        
       // aryStream.filter(x-> x>20).forEach(x->System.out.println(x));
        
		Arrays.stream(arys).filter(x-> x>20).forEach(x->System.out.println(x));
		
		

	}

}
