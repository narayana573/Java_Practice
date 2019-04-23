package pack3;

public class numswap {

    public void withthirdvariable(){

        int a=10,b=20,c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }

    public void withourthirdvariable(int a, int b){



        a=a+b;  //  a=10 b=20;  10+20=30  a=30
        b=a-b;  //              30-20=10  b=10
        a=a-b;  //              30-10=20  a=20

        System.out.println("A Value:"+a);
        System.out.println("B Value:"+b);
    }
}
