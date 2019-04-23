package pack3;

public class fibonacciseries {

    public void fibonacseri(){
        //System.out.println("fibonacciseries number:- 0");
       // System.out.println("fibonacciseries number:- 1");
        int a=0 ,b=1;
        int sum;
        for (int i=1; i<20; i++){
            System.out.println("fibonacciseries number:- "+a);
                sum = a+b;
                a=b;
                b=sum;
        }
    }
}
