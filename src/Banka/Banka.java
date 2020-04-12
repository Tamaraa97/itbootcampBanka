package Banka;

public class Banka {
	//napraviti klasu banka koja sadrzi listu racuna
	//pri kreiranju se pravi prazna lista,klasu opremiti metodama za dohvatanje racuna i dodavanje novih
	
	private Racun racuni[];
	private int poz;
	
	public Banka() {
		racuni = new Racun[50];
	}
	
	public void dodajRacun(Racun r) {
		racuni[poz] = r;
		poz++;
	}
	
	public Racun dohvatiRacun(String trazeniBrRacuna) {
		Racun r = null;
		for(int i=0;i<poz;i++) {
			String postojeciBrRacuna = racuni[i].getBrRacuna();
			if(trazeniBrRacuna.equalsIgnoreCase(postojeciBrRacuna)) {
				r = racuni[i];
				break;
			}
		}
		return r;
	}
}
