package com.cesar.voynich.tratadores;

import java.util.ArrayList;
import java.util.List;

import com.cesar.voynich.Voynich;
import com.cesar.voynich.util.Voymap;

public class TratadorRepeticao implements Tratador
{
	final Integer QUANTIDADE_CARACTERES_SUFIX = 4;
	Voymap voymap = null;
	
	public void sufixoMaisRepetido(Voynich voynich)
	{
		voymap = new Voymap();
		List<String> list = new ArrayList<String>(voynich.getWordsSet());

		for(String word : list)
		{
			try
			{
				String sufix = word.substring(word.length() - QUANTIDADE_CARACTERES_SUFIX, word.length());
				voymap.put(sufix);
			}catch (Exception e) {
			}
		}
		System.out.println(voymap.toString());
	}
	
	public void palavraMaisRepetidaAstrologia(Voynich voynic)
	{
		voymap = new Voymap();
		for(String word : voynic.getListForPage(67, 73))
		{
			voymap.put(word);
		}
		
		System.out.println(voymap.toString());
	}
	
	public void palavraMaisRepetida(Voynich voynic)
	{
		voymap = new Voymap();
		for(String word : voynic.getWords())
		{
			voymap.put(word);
		}
		
		System.out.println(voymap.toString(20));
	}
	
	public void palavraMaisRepetidaInicioPagina(Voynich voynic)
	{
		voymap = new Voymap();
		Integer paginaAnterior = -1;
		
		for(Integer pagina : voynic.pages.values())
		{
			try
			{
				voymap.put(
					voynic.words.get(paginaAnterior+1)
					);
				paginaAnterior = pagina;
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println(voymap.toString());
	}
	
	public void mneumonicoMaisRepetido(Voynich voynich)
	{
		voymap = new Voymap();
		List<String> words = new ArrayList<String>(voynich.getWords());

		for(String word : words)
		{
			try
			{
				
				
				for(int i=0; i<word.length(); i+=2)
				{
					String mneu = word.substring(i, i+2);
					voymap.put(mneu);
				}
			}catch (Exception e) {
			}
		}
		
		System.out.println(voymap.toString());		
	}
	
	public void minimaPalavraMaisAparece(Voynich voynich)
	{
		voymap = new Voymap();
		List<String> words = new ArrayList<String>(voynich.getWords());

		for(String word : words)
		{
			try
			{
				if(word.length() != 2)
					continue;
				
				voymap.put(word);
			}catch (Exception e) {
			}
		}
		
		System.out.println(voymap.toString());		
	}
	
	public void quantidadeDeCaracteres(Voynich voynich)
	{
		voymap = new Voymap();
		List<String> words = new ArrayList<String>(voynich.getWords());

		for(String word : words)
		{
			try
			{
				voymap.put(String.valueOf(word.length()));
			}catch (Exception e) {
			}
		}
		
		System.out.println(voymap.toString());		
	}
	
	@Override
	public void visit(Voynich voynich) 
	{
		palavraMaisRepetidaInicioPagina(voynich);
	}
}
