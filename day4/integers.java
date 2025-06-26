package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class integers {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 7, 8, 2, 5, 4, 9};

        // Create lists for odd and even numbers
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        // Separate odd and even numbers
        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        // Sort odd in descending order
        Collections.sort(odd, Collections.reverseOrder());

        // Sort even in ascending order
        Collections.sort(even);

        // Combine and print the result
        System.out.print("Output: ");
        for (int o : odd) {
            System.out.print(o + " ");
        }
        for (int e : even) {
            System.out.print(e + " ");
        }
    }
    
}
