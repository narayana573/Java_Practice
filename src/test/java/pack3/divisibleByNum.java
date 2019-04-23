package pack3;

public class divisibleByNum {

    public void divisibleBy(int a){

        if (a%5==0){
            System.out.println("Entered Number is Divided by 5");
        }
        else if (a%11==0){
            System.out.println("Entered Number is Divided by 11");
        }
        else
            System.out.println("Entered Number is Not Divided 5 & 11");
    }
}
