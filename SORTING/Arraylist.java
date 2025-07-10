import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
           ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);

        // Before sorting
        System.out.println("Before sorting: " + numbers);

        // Sort by using collection framework ..
        Collections.sort(numbers);

        // After sorting
        System.out.println("After sorting: " + numbers);


    }
}
