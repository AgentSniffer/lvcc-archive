package labTest;

import java.util.HashMap;

public class HashmapLab2 {
    public static void main(String[] args) {

        HashMap<String, Integer> brainrot = new HashMap<>();
        brainrot.put("Ballerina Cappuccina", 11333);
        brainrot.put("Cappuccino Assassino", 24414);
        brainrot.put("Apollino Cappuccino", 35553);
        brainrot.put("Tralalero Tralala", 43553);
        brainrot.put("Tung Tung Tung Sahur", 55898);

        HashMap<String, Integer> brainrot2 = new HashMap<>();

        for (String name : brainrot.keySet()) {
            brainrot2.put(name, brainrot.get(name));
        }

        brainrot2.put("Espressona Signora", 66666);


        for (String name : brainrot2.keySet()) {
            System.out.printf("Name: %s, ID: %d%n", name, brainrot2.get(name));
        }
    }
}