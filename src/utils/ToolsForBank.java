package utils;

import java.util.Arrays;
import java.util.List;

import domain.Bank;
import domain.Klient;
import domain.Lokata;

public class ToolsForBank {
	
	public static void sumyLokatKlienta(Klient klient){
		double suma = 0;
		
		for(Lokata l : klient.getListaLokat()){
			suma += l.getWartosc();
		}
		
		System.out.println(klient.getNazwisko()+ " "+ klient.getImie()+ " "+ suma);
		
	}
	
	public static void wyswietl(Bank bank){
		System.out.println("nazwa banku " + bank.getNazwaBanku() + " "+"Klienci: ");
		for(Klient k : bank.getListaKlientow()){
			System.out.println(k.getNazwisko()+" "+k.getImie());
		}
	}

}
