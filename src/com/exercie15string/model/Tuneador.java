package com.exercie15string.model;

public class Tuneador {
	public static String[] tunea(String...cadenas) {
		for(int i = 0; i<cadenas.length - 1; i++) {
			cadenas[i] = cadenas[i].trim();
			cadenas[i] = cadenas[i].toLowerCase();
			cadenas[i] = cadenas[i].replace("a", "o");
			cadenas[i] = cadenas[i].replace("e", "o");
			cadenas[i] = cadenas[i].replace("i", "o");
			cadenas[i] = cadenas[i].replace("u", "o");
		}
		
		return cadenas;
	}
	
	public static double obtenerMedia(double...numeros) {
		double suma = 0;
		double res = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		res = suma / numeros.length;
		return res;
	}
}
