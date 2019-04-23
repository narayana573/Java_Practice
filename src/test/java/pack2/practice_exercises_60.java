package pack2;

public class practice_exercises_60 {
    public void stringexistinanotherstring(){
        String inputString="raju";
        String mainString="Suryanarayana raju raju Raju raju";
        String mainStringArray[]= mainString.split(" ");
        int noOfTimesHappend = 0;
        for (int i=0; i<mainStringArray.length;i++){
          if(mainStringArray[i].equalsIgnoreCase(inputString)){
              noOfTimesHappend++;
          }
        }
        System.out.println(inputString +" happens "+noOfTimesHappend);
 }
}
