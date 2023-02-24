import java.util.Scanner;

public class EsContaLunghezzaStringa {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa :  ");
		System.out.println("------------");
		
		String parola = key.next();
		
		
		while(! ( parola.equals("exit"))) {
			
			System.out.println("Inserisci una stringa :  ");
			parola = key.next();
			

		}

		System.out.println("Hai finito");
		
		
		
		
		key.close();
	}

}
