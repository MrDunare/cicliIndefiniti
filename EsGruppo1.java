import java.util.Scanner;

public class EsGruppo1 {

	public static void main(String[] args) {
		
		/*
		 * Esercizio 2.1: Scrivere un programma TuttiPositiviPari che chiede all’utente di 
		 * inserire una sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi,
		 *  al termine dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se 
		 *  i numeri inseriti sono tutti positivi e pari,
		 *	altrimenti stampa "NO". Risolvere questo esercizio senza usare array.

		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("quanti numeri vuoi inserire?");
		
		int limite = key.nextInt();
		
		boolean isPariPositivo = false;
		
		int i = 0;
		
		int numero = 0;
		
		while(i < limite) {
			
			System.out.println("Inserisci i numeri: ");
			numero = key.nextInt();
		
			if(( numero > 0 && numero % 2 == 0) ) {
				isPariPositivo = true;
			}	
			else {
				isPariPositivo = false;
			}
				
			
			
			i++;
			
		}
		
		
		if(isPariPositivo)
			System.out.println("pari e positivi");
		else
			System.out.println("no");
		
		
		
		key.close();

	}

}
