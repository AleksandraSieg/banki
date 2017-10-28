package domain;

import java.util.List;

public class Klient {
	private String nazwisko;
	private String imie;
	private List<Lokata> listaLokat;
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public List<Lokata> getListaLokat() {
		return listaLokat;
	}
	public void setListaLokat(List<Lokata> listaLokat) {
		this.listaLokat = listaLokat;
	}
	public Klient(String nazwisko, String imie, List<Lokata> listaLokat) {
		super();
		this.nazwisko = nazwisko;
		this.imie = imie;
		this.listaLokat = listaLokat;
	}
	
	
}
