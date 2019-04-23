package pack2;

public class practice_exercises_61 {
    public  void comparestringigonrespaces(){
        String str1="Surya Raju ", str2=" surya raju";


        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        System.out.println("STR 1:"+str1);
        System.out.println("STR 2:"+str2);


        if(str1.contains(str2)){
            System.out.println("Two string are Compared with trimming the data");
        }

    }
}
