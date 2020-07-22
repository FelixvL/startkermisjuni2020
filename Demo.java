import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Attractie a = new Hawaii();
		a.naam = "hawaii";
		Attractie b = new Botsauto();
		b.naam = "botsauto";
		System.out.println(a.naam);
		System.out.println(b.naam);
		
		a.naamwijzigen("2");
		b.naamwijzigen("2");
		
		System.out.println(a.naam);
		System.out.println(b.naam);
	}


}

abstract class Attractie{
	String naam;
	 void naamwijzigen(String extra) {
		 System.out.println("in attractie");
	 }
}

class Botsauto extends Attractie{
	void naamwijzigen(String extra) {
		naam = naam.concat(extra+"X");
	}

}

class Hawaii extends Attractie{
	void naamwijzigen(String extra) {
		naam = naam.concat(extra+"Y");
	}
}
