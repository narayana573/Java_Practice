package pack2;

import java.util.Arrays;

public class practice_exercises_70 {

    public void findlargentvalueinarray(){
        int arr[] ={50,110,60,100};
        Arrays.sort(arr);
        System.out.println("Smallest element :"+arr[0]);
        System.out.println("Largest element :"+arr[arr.length-1]);

    }
}
