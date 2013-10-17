package com.cesar.voynich.tratadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cesar.voynich.Voynich;

public class TratadorOrdenacao implements Tratador
{

	@Override
	public void visit(Voynich voynich) 
	{
		List<String> list = new ArrayList<String>(voynich.getWordsSet());
		Collections.sort(list);
		
		System.out.println(list.toString().replace(",", "\n"));
		
	}

}
