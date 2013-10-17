package com.cesar.voynich.tratadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cesar.voynich.Voynich;

public class TratadorRepeticao implements Tratador
{
	final Integer QUANTIDADE_CARACTERES_SUFIX = 4;
	@Override
	public void visit(Voynich voynich) 
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		List<String> list = new ArrayList<String>(voynich.getWordsSet());
		
		for(String word : list)
		{
			try
			{
				String sufix = word.substring(word.length() - QUANTIDADE_CARACTERES_SUFIX, word.length());
				Integer qtd = map.get(sufix);
				if(qtd == null)
					map.put(sufix, 1);
				else
					map.put(sufix, (qtd+1));
			}catch (Exception e) {
			}
		}
		
		List<Entry<String, Integer>> ordenedList = new ArrayList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(ordenedList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return  o2.getValue().compareTo(o1.getValue());
			}
			
		});
		System.out.println(ordenedList.toString().replace(",", "\n"));
	}

}
