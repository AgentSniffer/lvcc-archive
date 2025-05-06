package labTest;


import java.util.ArrayList;
import java.util.Collections;

public class colorOrder {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        Collections.sort(colors);
        System.out.println("Ascending Order: " + colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Descending Order: " + colors);
    }
}
