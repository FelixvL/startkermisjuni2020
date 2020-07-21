import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		System.out.println("relaxt opstarten");
		new Demo().programmabedienen();
		System.out.println("we zijn klaar met het programma");
	}
	void programmabedienen() {
		System.out.println("Welke attractie wilt u een kaartje voor hebben?");
		Scanner scanner = new Scanner(System.in);
		String invoer = scanner.nextLine();		
		System.out.println("u heeft gekozen voor: "+invoer);
	}
}










