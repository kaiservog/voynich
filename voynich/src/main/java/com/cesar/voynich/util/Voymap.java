package com.cesar.voynich.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Voymap extends HashMap<String, Integer>
{
	public void put(String word)
	{
		Integer qtd = this.get(word);
		if(qtd == null)
			this.put(word, 1);
		else
			this.put(word, (qtd+1));
	}
	
	@Override
	public String toString()
	{
		List<Entry<String, Integer>> ordenedList = new ArrayList<Entry<String,Integer>>(this.entrySet());
		
		Collections.sort(ordenedList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return  o2.getValue().compareTo(o1.getValue());
			}
			
		});
		return ordenedList.toString().replace(",", "\n");
	}
	
	public String toString(int qtd)
	{
		List<Entry<String, Integer>> ordenedList = new ArrayList<Entry<String,Integer>>(this.entrySet());
		
		Collections.sort(ordenedList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return  o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		return ordenedList.subList(0,  qtd).toString().replace(",", "\n");
	}
	
}
