package pack2;

public class practice_exercises_58 {

    public void comparefirst3char(){

        String str1="Raju";
        String str2="raju";
         if(str1.substring(0,2).equalsIgnoreCase(str2.substring(0,2))){
            System.out.println("same characters");
        }
        else
            System.out.println("Different characters");
    }
}
