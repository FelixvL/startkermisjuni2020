import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		System.out.println("relaxt opstarten");
		new Demo().programmabedienen();
		System.out.println("we zijn klaar met het programma");
	}

	void programmabedienen() {
		Kassa kassa = new Kassa();
		kassa.starten();
	}
}

class Attractie{
	String naam;
	Attractie(String deNaam){
		naam = deNaam;
	}
	void draaien() {
		System.out.println("Ik ben aan het draaien, de attractie: "+ naam);
	}
}

class Kassa {
	Scanner scanner = new Scanner(System.in);
	Attractie a1 = new Attractie("Botsauto's");
	Attractie a2 = new Attractie("Hawaii");
	Attractie a3 = new Attractie("Spiegelpaleis");
		
	void starten() {
		boolean doorgaan = true;
		while (doorgaan) {
			String deKeuze = vraagOmAttractieKeuze();
			if (deKeuze.equals("q")) {
				doorgaan = false;
			} else {
				a1.draaien();
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
