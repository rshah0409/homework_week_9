
//Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop


import java.util.ArrayList;

public class CollectionForColors4 {
    public static void main(String[] args) {
        ArrayList<String> listOfColors = new ArrayList<String>();    //arraylist.
        listOfColors.add( "Black" );
        listOfColors.add( "White" );
        listOfColors.add( "Green" );
        listOfColors.add( "Pink" );
        listOfColors.add( "Orange" );
        listOfColors.add( "Turquoise" );

            for(String value:listOfColors){            //for each loop for iterration
                     System.out.println(value);


        }
    }






}
