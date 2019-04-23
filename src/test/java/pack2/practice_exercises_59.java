package pack2;

public class practice_exercises_59 {
    public void upperandlower() {
        String s = "surya";
        String aa =" ";
        String z[] = s.split("");
        System.out.println(s.length());
        for (int i = 0; i <s.length(); i++) {

            if (i % 2 == 0) {
                aa = aa + z[i].toLowerCase();
            } else {
                aa = aa + z[i].toUpperCase();
            }
        }
        System.out.println("Converted string:" + aa);
            }
}
