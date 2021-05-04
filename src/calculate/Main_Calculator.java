package calculate;

import java.util.Scanner;

public class Main_Calculator extends Calculator {
    public static void main(String[] args) {
        char input;
        Scanner scan = new Scanner( System.in );       //scanner
        Main_Calculator obj = new Main_Calculator();    //main method object.

        //do-while loop for iterating result.

        do {
            System.out.println( "Enter First Number" );
            int a = scan.nextInt();
            System.out.println( "Enter Second Number" );
            int b = scan.nextInt();
            System.out.println( "Enter symbol here : " );
            char symbol = scan.next().charAt( 0 );
            obj.calculateResult( a, b, symbol );
            System.out.println( "Would you like to do more calculation Please enter 'Y' for yes  OR 'N' for no  " );
            input = scan.next().charAt( 0 );
        } while (input == 'Y' || input=='Y') ;





    }


}







