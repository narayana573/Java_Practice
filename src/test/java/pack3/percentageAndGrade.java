package pack3;

import java.util.Scanner;

public class percentageAndGrade {

    public void grade() {

        // Declare the object and initialize with
        // predefined standard input object
        Scanner scan = new Scanner(System.in);

        // Int input
        System.out.println("Enter Physics Marks:-");
        int physics = scan.nextInt();
        System.out.println("Enter chemistry Marks:-");
        int chemistry = scan.nextInt();
        System.out.println("Enter biology Marks:-");
        int biology = scan.nextInt();
        System.out.println("Enter Maths Marks:-");
        int Maths = scan.nextInt();
        System.out.println("Enter Computer Marks:-");
        int Computer = scan.nextInt();


        System.out.println("Enter Physics Marks:-" + physics);
        System.out.println("Enter chemistry Marks:-" + chemistry);
        System.out.println("Enter biology Marks:-" + biology);
        System.out.println("Enter Maths Marks:-" + Maths);
        System.out.println("Enter Computer Marks:-" + Computer);

        int avg = (physics + chemistry + biology + Maths + Computer) / 5;
        System.out.println("Average of 5 Subjects:"+avg);
        if (avg >= 90) {
            System.out.println("Grade A");

        } else if (avg >= 70) {

            System.out.println("Grade B");
        }
        else if (avg >= 60) {

            System.out.println("Grade C");
        }
        else if (avg >= 40) {

            System.out.println("Grade D");
        }
        else   {

            System.out.println("Grade E");
        }

    }
}