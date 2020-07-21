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


class Kassa{
	Scanner scanner = new Scanner(System.in);	
	void starten() {
			boolean doorgaan = true;
			while(doorgaan) {
				String deKeuze = vraagOmAttractieKeuze();
				if(deKeuze.equals("q")) {
					doorgaan = false;
				}else {
					System.out.println("nog een rondje");
				}
			}
	}
	String vraagOmAttractieKeuze() {
		System.out.println("Welke attractie wilt u een kaartje voor hebben?");
		String invoer = scanner.nextLine();		
		System.out.println("u heeft gekozen voor: "+invoer);
		return invoer;
	}
	
}









