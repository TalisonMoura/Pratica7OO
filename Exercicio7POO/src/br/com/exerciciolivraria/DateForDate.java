package br.com.exerciciolivraria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateForDate {
	public static void main(String [] args) throws ParseException	{
		
		String dataPF = "01-01-2001";
		
		Date formataData = new SimpleDateFormat("dd-MM-yyyy").parse(dataPF);
		System.out.println(formataData);
		
		java.sql.Date data_sql02 = converteData(formataData);
		System.out.println("Java sql date, formated: "+data_sql02);
			
	}
		private static java.sql.Date converteData(java.util.Date data)	{
			java.sql.Date minhaData = new java.sql.Date(data.getTime());
			return minhaData;
		}

}
