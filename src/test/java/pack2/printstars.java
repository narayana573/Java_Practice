package pack2;

public class printstars {

    public void printsrat(){
        int i,j;
        for(i=0;i<10;i++){
        for (j=0;j<10;j++){
            System.out.print("*");
        }
            System.out.println();
        }
    }


    public void printsratempty(){
        int i,j;
        for(i=0;i<10;i++){
            for (j=0;j<10;j++){
                if(i==0 || i==9 || j==0 || j==9) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
