package pack2;

public class stringtrim {

    public void stringremovespace(){
        String str="This is My New String";
        int j=str.length();
        System.out.println("Characters Count is :"+j);
        String spl [] = str.split(" ");
        for (int i=0; i<j;i++){
            System.out.print(spl[i]);
        }
    }

    public void stringworkcount(){
        String str ="This is Testing World This surya";
        System.out.println();
        int j = str.length();
        System.out.println("Characters Count is :"+j);
       String z[]= str.split(" ");
        System.out.println(z.length+" Words.");


    }



}
