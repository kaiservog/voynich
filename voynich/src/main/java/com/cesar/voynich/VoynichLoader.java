package com.cesar.voynich;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VoynichLoader 
{
	public Voynich load(File file) throws IOException
	{
		long inicial = System.currentTimeMillis();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "";
		String[] words;
		Voynich voynich = new Voynich(); 
		while((line = reader.readLine()) != null)
		{
			words = line.replace("!", "").replaceAll("\\<.*?\\>", "").trim().split("\\.");
			List<String> list = convert(words);
			voynich.words.addAll(list);
		}
		
		return voynich;
	}

	private List<String> convert(String[] words) {
		List<String> list = new ArrayList<String>(words.length);
		
		for(int i=0; i < words.length; i++)
		{
			if(words[i].equals(""))
				continue;
			list.add(words[i]);
		}
		return list;
	}
}
