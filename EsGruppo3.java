import java.util.Scanner;

public class EsGruppo3 {

	public static void main(String[] args) {
		
		
		
//		Esercizio 2.3: Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
//		di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
//		valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
//		del messaggio "OK" può interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
//		usare array.
		
		Scanner key = new Scanner(System.in);
		
		boolean isPositivoNegativo = false; 
		
		System.out.println("Inserisci il primo numero : ");
		
		int numero = key.nextInt();
		
		while(numero != 0) {
			
			int precedente = numero;
			System.out.println("inserisci nuovo numero");
			numero = key.nextInt();
			
			if(precedente>0 && numero<0) {
				isPositivoNegativo = true;
				break;
			}
		}	
			
		if(isPositivoNegativo) 
			System.out.println("ok");
	
	
		key.close();

	}

}
