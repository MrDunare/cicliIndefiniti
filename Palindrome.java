import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa :  ");
		
		String parola = key.next();
		
		int i = parola.length()-1;
		
		String parolaReversed = "";
		
		
		while(i >= 0 ) {
			
			parolaReversed += parola.charAt(i);
			
			i--;
				
		}
		
		System.out.println("Reversed -----> " + parolaReversed);
		
		if(parola.equals(parolaReversed))
			System.out.println("palindrome");
		else
			System.out.println("non sono palindrome");
	
		
		key.close();

	}

}
