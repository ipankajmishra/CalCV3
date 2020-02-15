package com.sapient.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class History {
	public static List<List<String>> ob= new  ArrayList<>();
	private LocalDate date;
	public History() {
		//ob = new  ArrayList<>();
	}
	
	public abstract void evaluate() throws Exception;
	
	public void addHistory(String x, String result, LocalDateTime localDateTime) {
		List<String> list = new ArrayList<>();
		list.add(x);
		list.add(result);
		list.add(localDateTime.toString());
		ob.add(list);
	}
	
	public static void displayHistory() {
		
		ob.forEach(System.out::println);
	}
}
