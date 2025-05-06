package labTest;
import java.util.Scanner;
public class vowelDetector {
	public static void main(String[]args) {
		
		char vowel;
		
		System.out.print("Enter a Vowel: ");
		Scanner sc = new Scanner(System.in);
		vowel = sc.next().toLowerCase().charAt(0);
		System.out.println();
		
		switch (vowel) {
		// idk what to contain it into one so i use the dry method
		// and i know its bad XD
		// dry DON'T REPEAT YOURSELF
		
		//TODO: MAKE IT CLEAN
//			case 'a':
//				System.out.println("\""+vowel+"\"" +" Is a vowel");
//				break; 
//			case 'e':
//				System.out.println("\""+vowel+"\"" +" Is a vowel");
//				break;
//			case 'i':
//				System.out.println("\""+vowel+"\"" +" Is a vowel");
//				break;
//			case 'o':
//				System.out.println("\""+vowel+"\"" +" Is a vowel");
//				break;
//			case 'u':
//				System.out.println("\""+vowel+"\"" +" Is a vowel");
//				break;
			case 'a':
				//enchanced swtich caset -->/old java 14
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("\""+vowel+"\"" +" Is a vowel");
				break;
			default:
				System.out.println("\""+vowel+"\"" + " Is not a vowel");
				
			
		}
		
		
		
		
		sc.close();
	}

}
