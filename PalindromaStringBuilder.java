import java.util.Scanner;

public class PalindromaStringBuilder {

	public static void main(String[] args) {
		
		// altro dato non primitivo StringBuilder
		
				Scanner key = new Scanner (System.in);
				System.out.println("Inserisci parola:");
				String parUtente = key.next();
				
				
				StringBuilder parolaInvertita = new StringBuilder(parUtente);
				
				parolaInvertita.reverse();
				
				System.out.println(parolaInvertita);
				
				if (parUtente.equals(parolaInvertita.toString()))
					System.out.println("ok");
				else
					System.out.println("No");
				
				key.close();
				
				
	}

}
