package pack1;

public class conditionhandling {


    public void findBigNum(int a, int b, int c) {

        if (b < a && c < a) {
            System.out.println("A Value is Big");

        } else if (a < b && c < b) {

            System.out.println("B Value is Big");
        } else if (a < c && a < c) {
            System.out.println("C Value is Big");

        }

    }

    public void findSmallNum(int a, int b, int c) {

        if (b > a && c > a) {
            System.out.println("A Value is Small");

        } else if (a > b && c > b) {

            System.out.println("B Value is Small");
        } else if (a > c && a > c) {
            System.out.println("C Value is Small");

        }

    }

}