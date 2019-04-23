package pack2;

public class practice_exercises_62 {

    public void reversestring(){
//
        String str ="ujaridaG ujaR anayaranayruS",con="";
        String spli[] = str.split("");
        int len= str.length();
        for (int i= len-1;i>=0;i--){
            con = con+spli[i];
        }
        System.out.println("reverse String is:"+con);

    }
}
