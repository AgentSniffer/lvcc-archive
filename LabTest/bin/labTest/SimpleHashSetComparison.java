package labTest;

import java.util.HashSet;

public class SimpleHashSetComparison {
    public static void main(String[] args) {

    	
        HashSet<String> colorSet1 = new HashSet<>();
        HashSet<String> colorSet2 = new HashSet<>();

        colorSet1.add("red");
        colorSet1.add("green");
        colorSet1.add("blue");
        colorSet1.add("yellow");
        colorSet1.add("purple");


        colorSet2.add("red");
        colorSet2.add("orange");
        colorSet2.add("blue");
        colorSet2.add("pink");
        colorSet2.add("black");
        
        System.out.println("HashSet1:\n");
        // Check similarities and differences
        for (String color : colorSet1) {
            if (colorSet2.contains(color)) {
                System.out.println(color + " --> exists in the second HashSet.");
            } else {
                System.out.println(color + " --> does not exist in the second HashSet.");
            }
        }
        
        System.out.println("\n\nHashSet2:\n");
        for (String color : colorSet2) {
            if (colorSet1.contains(color)) {
                System.out.println(color + " --> exists in the first HashSet.");
            } else {
                System.out.println(color + " --> does not exist in the first HashSet.");
            }
        }
    }
}