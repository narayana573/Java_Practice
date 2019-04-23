package pack2;

public class practice_exercises_63 {

    public void palindrome(){
        String str = "otto",b="";
        String rev[] =str.split("");
        System.out.println("Length of word:"+rev.length);
        for (int i= rev.length-1; i>=0; i-- ){

                b=b+str.charAt(i);
        }
        if(str.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }

    }
}
