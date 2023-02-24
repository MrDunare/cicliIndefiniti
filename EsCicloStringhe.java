import java.util.Scanner;

public class EsCicloStringhe {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa :  ");
		System.out.println("------------");
		
		String parola = key.next();
		String parola2 = key.next();
		
		String nuovaParola = "";
		
		int i = 0;
		
		
		while(i < parola.length()/2) {
			
			if(parola2.length() ==  parola.length()) {
				
				nuovaParola += parola.charAt(i) + "" + parola2.charAt(i);	
		
			}
			
			else
				System.out.println("che cazzo non va");
			
			i++;
			
		}
		
		System.out.println(nuovaParola);
		
		key.close();
	}

}
