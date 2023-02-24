import java.util.Scanner;

public class SommatoriaIndefinita {

	public static void main(String[] args) {
		
Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero :  ");
		System.out.println("------------");
		
		int numero = key.nextInt();	
		
		int somma = 0;
		
		while(numero != 0) {
			
			
			somma += numero;
			System.out.println("inserisci👨🏼‍💻");
			System.out.println("la somma vale " + somma);
			numero = key.nextInt();
			
			
		}
		
		System.out.println("La somma vale " + somma);
		
		
		
		key.close();
	}

}
