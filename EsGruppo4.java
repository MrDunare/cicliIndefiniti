import java.util.Scanner;

public class EsGruppo4 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		 
		System.out.println("quanti numeri? ");
		
		int limite = key.nextInt();

		int cont = 0;
		int somma = 0;
		int divisibili = 0;
		
		while(cont < limite) {
			
			System.out.println("inserisci un numero: ");
			int numero = key.nextInt();
			
			if(numero % 3 == 0) {
				somma += numero;
				divisibili++;
			}	
			
			cont++;
			
		}
		
		System.out.println("-------------\nla media dei numeri divisibili per 3 vale " +  somma/divisibili);
		
		key.close();
		
	}


}
