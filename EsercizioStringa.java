import java.util.Scanner;

public class EsercizioStringa {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa :  ");
		System.out.println("------------");
		
		String parola = key.next();
		
		int i = 0;
		
		String parola2 = "";
		
		while(i < parola.length() ){
			
			if(parola.charAt(i) == 'a')
				parola2 += '@';
			else 
				parola2+=parola.charAt(i);
				
						
			i++;

			
		}
		
		System.out.println(parola2);
		
		key.close();
		
		
	}

}
