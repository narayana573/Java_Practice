package pack2;

import java.util.Arrays;
import java.util.Collections;

public class practice_exercises_74 {

    public void sortarrayasd() {
       // String[] cubes = new String[]{"a", "z", "b", "y", "f", "s", "r", "aa"};
        Integer[] cubes = new Integer[]{20, 10, 2, 5, 12, 5555, 33, -3};
        Arrays.sort(cubes, Collections.reverseOrder());

        for (int i = 0; i < cubes.length; i++) {
            System.out.println("Descending order Values:" + cubes[i]);
        }
        Arrays.sort(cubes);


        for (int i = 0; i < cubes.length; i++) {
            System.out.println("Ascending order Values:" + cubes[i]);


        }


    }
}