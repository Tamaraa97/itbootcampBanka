package Banka;

public class Glavnaklasa {

	public static void main(String[] args) {
		//Banka intesa = new Banka();
		Banka2 intesa = new Banka2();
		
		Racun r1 = new Racun("262373732",new Covek("Tamara","Pecnik","12345","15615"));
		Racun r2 = new Racun("736737363",new Covek("Pera","Peric","46839","62930"));
		Racun r3 = new Racun("123434544",new Covek("Ivo","Andric","55555","26353"));
		
		System.out.println(r2.getStanje());
		r2.dodajNovac(100000.00);
		System.out.println(r2.getStanje());
		r2.oduzmiNovac(11000.32);
		System.out.println(r2.getStanje());
		
		System.out.println(r3.getStanje());
		
		intesa.dodajRacun(r1);
		intesa.dodajRacun(r2);
		intesa.dodajRacun(r3);
		
		System.out.println(intesa.dohvatiRacun("1363773"));
		
		if(r3 != null) {
			System.out.println(r3.getStanje());
		}
		

	}

}
