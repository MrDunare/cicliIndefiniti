import java.util.Scanner;

public class EsGruppo2 {

	public static void main(String[] args) {
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero : ");
		
		
		int numero = key.nextInt();
		
		int somma = 0;
		
		
		while(numero < 0 && numero % 2 == 0 || numero > 0 && numero % 3 == 0 ) {
			
			somma+=numero;
			System.out.println("Inserisci un numero : ");
			numero = key.nextInt();
			
		}
		
		System.out.println("la fine ----> " + somma);
		
		
		key.close();

	}

}
