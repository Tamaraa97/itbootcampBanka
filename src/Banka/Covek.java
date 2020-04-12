package Banka;

public class Covek {
	//svi podaci mogu da se dohvate ali ne i postave ,metoda ispis,koja vraca ime_prezime
	private String ime;
	private String prezime;
	private String jmbg;
	private String brlk;
	
	public Covek(String ime,String prezime,String jmbg,String brlk) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brlk = brlk;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public String getBrlk() {
		return brlk;
	}

	@Override
	public String toString() {
		return  ime + "_" + prezime;
	}
	
	
	

}
