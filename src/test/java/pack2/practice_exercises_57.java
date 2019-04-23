package pack2;

public class practice_exercises_57 {
    public void comparelast10char(){
        String str1="This is Testing World";
        String str2="My TesTing World";




        if(str1.substring(str1.length()-10,str1.length()).equalsIgnoreCase(str2.substring(str2.length()-10,str2.length()))){
            System.out.println("same characters");
        }
        else
            System.out.println("Different characters");



    /*    for (int x= str1.length()-10; x<str1.length();x++){
            str1.charAt(x);

            for (int y= str2.length()-10; y<str2.length();y++){
                str2.charAt(y);

                if(str1.charAt(x)==str2.charAt(y)){
                    System.out.println("both are same. "+str1.charAt(x)+ "-------->"+str2.charAt(y));
                }
                else
                    System.out.println("Not Same.");
                System.out.println("Diff Char:- "+str1.charAt(x)+ "-------->"+str2.charAt(y));
            }
        }*/

    }
}
