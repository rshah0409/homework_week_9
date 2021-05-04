import java.util.Locale;
import java.util.Scanner;

public class MarkSheet2WithWhileLoop {
    Scanner scan = new Scanner( System.in );//scanner called
    public static void main(String[] args) {

        MarkSheet2WithWhileLoop obj = new MarkSheet2WithWhileLoop();
        char input = 'Y';
       while(input=='Y') {                   //while loop for iteration of marksheet
           obj.studentResult();
           System.out.println("Do you want to add more results?");
           input=obj.scan.next().toUpperCase( Locale.ROOT ).charAt( 0 );
       }
    }



    public boolean studentResult() {




            System.out.println( "Enter Student Name : " );
            String name = scan.next();
            System.out.println( "Enter Student Roll Number Here : " );
            int rollNmuber = scan.nextInt();
            System.out.println( "Enter Marks for Maths here : " );
            int maths = scan.nextInt();
            System.out.println( "Enter Marks for Science here: " );
            int science = scan.nextInt();
            System.out.println( "Enter Marks for English here:  " );
            int english = scan.nextInt();
            int total = maths + science + english;
            double percentage = (total * 100) / 300;

            String result = null;
            String grade = null;

            //if else statement
            if ((maths < 0 || maths > 100) || (science < 0 || science > 100) || (english < 0 || english > 100)) {
                System.out.println( "Invalid input" );
                return false;
            }  if (percentage >= 80) {
                result = "PASS";
                grade = "A+";
            } else  if (percentage >= 60) {
                result = "PASS";
                grade = "A";
            } else if (percentage >= 50) {
                result = "PASS";
                grade = "B";
            } else if (percentage >= 35) {
                result = "PASS";
                grade = "C";
            } else {
                result = "FAIL";
            }

       // input = scan.next().charAt( 0 );

            // System.out.println(input);

            System.out.println( "---------------------------" );
            System.out.println( "|                          |" );
            System.out.println( "|       MARKSHEET          |" );
            System.out.println( "|                          |" );
            System.out.println( "|--------------------------|" );
            System.out.println( "|   Name :" + name + "       |" );
            System.out.println( "|   Roll No:" + rollNmuber + " |" );
            System.out.println( "|                          |" );
            System.out.println( "|Subject: Marks:           |" );
            System.out.println( "|Maths:" + maths + "           |" );
            System.out.println( "|Science:" + science + "       |" );
            System.out.println( "|English:" + english + "       |" );
            System.out.println( "|                          |" );
            System.out.println( "|Total:" + total + "           |" );
            System.out.println( "---------------------------|" );
            System.out.println( "|Percentage:" + percentage + " |" );
            System.out.println( "|Result:" + result + "         |" );
            System.out.println( "|Grade:" + grade + "           |" );
            System.out.println( "--------------------------" );
            System.out.println();




            return true;
        }







}
