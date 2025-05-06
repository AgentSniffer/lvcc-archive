package labTest;
 import java.util.Scanner;
public class calculateGrade {
	public static void main(String[]args) {
		
		double gradeChemistry;
		double gradePhysics;
		double gradeMath;
		double gradeEnglish;
		double gradeComProg;
		double total = 0;
		double average = 0;
		String equivalent = "";
		
		
		System.out.print("\t\tCalculate grade\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input your grade on Chemistry: ");
		gradeChemistry = sc.nextDouble();
		System.out.print("Input your grade on Physics: ");
		gradePhysics = sc.nextDouble();
		System.out.print("Input your grade on Math: ");
		gradeMath = sc.nextDouble();
		System.out.print("Input your grade on English: ");
		gradeEnglish = sc.nextDouble();
		System.out.print("Input your grade on ComProg: ");
		gradeComProg = sc.nextDouble();
		
		total = gradeChemistry + gradePhysics + gradeMath + gradeEnglish + gradeComProg;
		average = total / 5;
		
		System.out.println();
		
		if(90 <= average){
			equivalent = "A";
		}
		else if(80 <= average){
			equivalent = "B";
		}
		else if(70 <= average){
			equivalent = "C";
		}
		else if(60 <= average){
			equivalent = "D";
		}
		else if(59 >= average){
			equivalent = "F";
		}
		
		System.out.printf("\nTotal: \"%.2f\"\nAverage:\"%.2f\"\nEquivalent: \"%s\"", total, average, equivalent);
		
	}
}
