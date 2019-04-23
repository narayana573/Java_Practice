package pack2;

public class devisiblebyxnum {

    public void divisible(){
        int i,x=11;
        for (i=0; i<=10;i++){

            if((i*x)%3!=0) {
                System.out.println(x + "*" + i + "=" + i * x);
            }
        }

    }
}
