import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		System.out.println("relaxt opstarten");
		new Demo().programmabedienen();
		System.out.println("we zijn klaar met het programma");
	}

	void programmabedienen() {
		Kassa kassa = new Kassa();
		kassa.starten();  // argument string // signature
		System.out.println(kassa.a1.omzet + " omgezet door "+ kassa.a1.naam);
		System.out.println(kassa.a2.omzet + " omgezet door "+ kassa.a2.naam);
		System.out.println(kassa.a3.omzet + " omgezet door "+ kassa.a3.naam);
	}
}

class Attractie{
	String naam;
	int prijs;
	int omzet;
	Attractie(String denaam, int prijs){
		naam = denaam;
		this.prijs = prijs;
	}
	void draaien() {
		omzet += prijs;
		System.out.println("Ik ben aan het draaien, de attractie: "+ naam);
	}
}

class Kassa {
	Scanner scanner = new Scanner(System.in);
	Attractie a1 = new Attractie("Botsauto's", 3);
	Attractie a2 = new Attractie("Hawai", 6);
	Attractie a3 = new Attractie("Spiegelpaleis", 9);
		
	void starten() { // parameter   // signature
		boolean doorgaan = true;
		while (doorgaan) {
			String deKeuze = vraagOmAttractieKeuze();
			if (deKeuze.equals("q")) {
				doorgaan = false;
			} else {
				if(deKeuze.equals("1")) {
					a1.draaien();
				}
				if(deKeuze.equals("2")) {
					a2.draaien();
				}
				if(deKeuze.equals("3")) { 
					a3.draaien();
				}
		
			}
		}
	}

	String vraagOmAttractieKeuze() {
		System.out.println("Welke attractie wilt u een kaartje voor hebben?");
		String invoer = scanner.nextLine();
		System.out.println("u heeft gekozen voor: " + invoer);
		return invoer;
	}
}
