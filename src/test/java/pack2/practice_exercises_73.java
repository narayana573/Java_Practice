package pack2;

public class practice_exercises_73 {

    public void evenvaluefindinarray(){
        String str[]={"surya","narayana","raju","gadiraju","surya raju"};
        for (int i=0;i<str.length;i++){
            if (i%2==0){
                System.out.println("even positions vales:"+str[i]);
            }
        }
    }


    public void evenvalueinarray(){
        int arr[]={34,1,343,45,22,33,44};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("Even Value in array:"+arr[i]);
            }
        }
    }
}
