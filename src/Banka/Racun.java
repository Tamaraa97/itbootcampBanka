package Banka;

public class Racun {
	private String brRacuna;
	private double stanje;
	private Covek klijent;

	// pri kreiranju nije potrebno zadati stanje ono se postavlja na 0
	public Racun(String brRacuna, Covek klijent) {
		this.brRacuna = brRacuna;
		this.klijent = klijent;
		stanje = 0;
	}

	// napisati metode dodajnovac i oduzmi novac,svi podaci mogu da se procitaju

	public boolean dodajNovac(double iznos) {
		if (iznos > 0) {
			stanje = stanje + iznos;
			return true;
		} else {
			System.out.println("Pogresan iznos");
			return false;
		}
	}

	public double oduzmiNovac(double iznos) {
		if(iznos > 0 && iznos <=stanje) 
			stanje = stanje - iznos;
			else
				System.out.println("greska");
		return stanje;
	}

	public String getBrRacuna() {
		return brRacuna;
	}

	public double getStanje() {
		return stanje;
	}

	public Covek getKlijent() {
		return klijent;
	}

	@Override
	public String toString() {
		return "Racun [brRacuna=" + brRacuna + ", stanje=" + stanje + ", klijent=" + klijent + "]";
	}
	
	
	

}
