package utils;

import java.util.Arrays;
import java.util.List;

import domain.Bank;
import domain.Klient;
import domain.Lokata;

public class Create {
	
	public static Bank createBank(String nazwaBanku, List<Klient> listaKlientow){
		return new Bank(nazwaBanku, listaKlientow);
	}
	
	public static Klient createKlient(String nazwisko, String imie, List<Lokata> listaLokat){
		return new Klient(nazwisko, imie, listaLokat);
	}
	
	public static Lokata createLokata(double wartosc){
		return new Lokata(wartosc);
	}
	
	public static List<Bank> createListBank(Bank...banks){
		return Arrays.asList(banks);
	}
	
	public static List<Klient> createListKlient(Klient...klients){
		return Arrays.asList(klients);
	}
	
	public static List<Lokata> createListLokata(Lokata...lokatas){
		return Arrays.asList(lokatas);
	}
}
