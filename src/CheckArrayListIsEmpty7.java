//Write a Java program to test an array list is empty or not. Define array list with  underground tube names

import java.util.ArrayList;

public class CheckArrayListIsEmpty7 {

    public static void main(String[] args) {
        ArrayList<String> trainList = new ArrayList<>();
        trainList.add( "Bakerloo Line" );
        trainList.add( "Northen  Line" );
        trainList.add( "Piccadily Line" );
        trainList.add( "Circle Line" );
        trainList.add( "Jubilee Line" );
        trainList.add( "Hammersmith & City Line" );
        trainList.clear();                         //to make arraylist empty.


      //using isempty method to see if string is empty or not.
        if (trainList.isEmpty()) {
            System.out.println( "The train list is  empty");
        } else {
            System.out.println( "The train list is not empty" );
        }
    }


}
