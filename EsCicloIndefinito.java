import java.util.Scanner;

public class EsCicloIndefinito {

	public static void main(String[] args) {
		/*
		 * 
		 * Creare un progrmma che chiede e stampa a video una sequanza di numeri
		 * 
		 * fino a quandp l'utente non inserisce lo zero
		 * 
		 * 
		 * 
		 */

		
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero :  ");
		System.out.println("------------");
		
		int numero = key.nextInt();	
		
		
		while(numero != 0) {
			
			System.out.println(numero);
			System.out.println("inserisci");
			numero = key.nextInt();
			
		}
		
		
		System.out.println("Fine");
		
		
		
				
		
		
		key.close();
		
	}

}
