package pack2;

public class practice_exercises_72 {


    String str[]={"surya","james","surya","james","James","surya","surya"};
    //String str1[]={"123","333","surya","james","333","surya","555"};


    public void searcharray(){

        for (int i=0; i<str.length;i++){
            int k=1;
            for (int j=i+1; j<str.length;j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    k++;
                }
            }System.out.println(str[i]+":"+k);
        }
    }
}
