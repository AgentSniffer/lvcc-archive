//package inverter;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class color {
//	public static void find(ArrayList<String>color, String guess) {
//		ArrayList<String> colors = new ArrayList<String>();
//		Scanner input = new Scanner(System.in);
//		
////		First way to use add() method
//		colors.add("Red");
//		colors.add("Orange");
//		colors.add("Yellow");
//		colors.add("Green");
//		colors.add("Blue");
//		colors.add("Indigo");
//		colors.add("Violet");
//		for (String i : colors) {
//			System.out.println(i);
//			find(color, guess);
//			
//		System.out.print("Enter a Color:");
//		String guess1 = input.nextLine();
//		
//		boolean found = false;
//		
//		for (String color1: colors) {
//				if (color1.equals(guess1)) {
//					System.out.println("The color, " + guess1 + ", exists  is the ArrayList");
//					found = true;
//					break;
//				}
//			}
//		
//		if (!found) {
//			System.out.println("The color, " + guess1 + ", does not exists.");
//			}
//		}
//	}
//}