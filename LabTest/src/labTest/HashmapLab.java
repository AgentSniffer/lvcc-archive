package labTest;

import java.util.HashMap;

public class HashmapLab {
    public static void main(String[] args) {

    	
    	HashMap<String, Integer> brainrot = new HashMap<>();
    	brainrot.put("Ballerina Cappuccina", 11333);
    	brainrot.put("Cappuccino Assassino", 24414);
    	brainrot.put("Apollino Cappuccino", 35553);
    	brainrot.put("Tralalero Tralala", 43553);
    	brainrot.put("Tung Tung Tung Sahur", 55898);


        
        for (String name : brainrot.keySet()) {
            System.out.printf("Name: %s, ID: %d%n", name, brainrot.get(name));
        }
    }
}