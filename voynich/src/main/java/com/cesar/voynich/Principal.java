package com.cesar.voynich;

import java.io.File;
import java.io.IOException;

import com.cesar.voynich.tratadores.TratadorOrdenacao;
import com.cesar.voynich.tratadores.TratadorRepeticao;

public class Principal 
{
	public static void main(String[] args) throws IOException 
	{
		VoynichLoader loader = new VoynichLoader();
		Voynich voynich = loader.load(new File("C:\\Users\\cvoginski\\Documents\\private\\Manuscrito.txt"));
		
		voynich.accept(new TratadorRepeticao());
		
		
	}
}
