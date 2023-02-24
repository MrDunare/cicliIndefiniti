import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		/*
		 * 
		 * numero primo
		 * 
		 * stampa se è primo oppure no
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci un numero :  ");
		System.out.println("------------");
		
		int num = key.nextInt();
		
		int i = 1;
		
		int cont = 0;
		
		while(i <= num) {
			
			if(num % i == 0 )
				
				cont++;
		
			i++;
			if(cont>2)
				break;
			
			
		}
		
		System.out.println("------------");
		
		if(cont>2)
			System.out.println("non è primo");
		else
			System.out.println("è primo");
		
		
		key.close();
	}

}
