package Banka;

import java.util.ArrayList;

public class Banka2 {
	
	private ArrayList<Racun> racuni;
	
	public Banka2() {
		racuni = new ArrayList<Racun>();
	}
	
	public void dodajRacun(Racun r) {
		racuni.add(r);
	}
	
	public Racun dohvatiRacun(String trazeniBrRacuna) {
		Racun r = null;
		
		for(int i=0;i< racuni.size();i++) {
		String postojeciBrRacuna = racuni.get(i).getBrRacuna();
		if(trazeniBrRacuna.equals(postojeciBrRacuna)) {
			r = racuni.get(i);
			break;
		}
		}
		
		return r;
	}
}
