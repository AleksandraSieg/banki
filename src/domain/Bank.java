package domain;

import java.util.List;

public class Bank {
	private String nazwaBanku;
	private List<Klient> listaKlientow;
	public String getNazwaBanku() {
		return nazwaBanku;
	}
	public void setNazwaBanku(String nazwaBanku) {
		this.nazwaBanku = nazwaBanku;
	}
	public List<Klient> getListaKlientow() {
		return listaKlientow;
	}
	public void setListaKlientow(List<Klient> listaKlientow) {
		this.listaKlientow = listaKlientow;
	}
	public Bank(String nazwaBanku, List<Klient> listaKlientow) {
		super();
		this.nazwaBanku = nazwaBanku;
		this.listaKlientow = listaKlientow;
	}
	
	
}
