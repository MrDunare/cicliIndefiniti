import java.util.Scanner;

public class EsGruppo5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int contProgramma = 0;
		
		while(contProgramma < 5) {
			
		
			System.out.println("quanti caratteri? ");
			
			int limite = key.nextInt();
			
			int cont = 0;
			
			
			while(cont < limite) {
				
				System.out.println("inserisci il carattere:");
				System.out.println("-----------------------");
				char carattere = key.next().charAt(0);
				System.out.println(carattere);
				
				cont++;
			}
			
			contProgramma++;
			System.out.println("-----------HAI FINITO IL " + (contProgramma) + " PROGRAMMA----------");
			
			if(contProgramma==5)
				System.out.println("VAI A DORMIRE");
		}
		
		key.close();
	
	}

}
