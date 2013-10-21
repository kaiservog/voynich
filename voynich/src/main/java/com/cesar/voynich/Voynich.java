package com.cesar.voynich;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cesar.voynich.tratadores.Tratador;

public class Voynich 
{
	public List<String> words = new ArrayList<String>(40000);
	public Map<Integer, Integer> pages = new HashMap<Integer, Integer>();
	
	public List<String> getListForPage(Integer begin, Integer end)
	{
		return words.subList(pages.get(begin), pages.get(end));
	}
	public List<String> getWords()
	{
		return new ArrayList<String>(words);
	}
	
	public Set<String> getWordsSet()
	{
		return new HashSet<String>(words);
	}
	
	public void accept(Tratador visitor)
	{
		visitor.visit(this);
	}
	
}
