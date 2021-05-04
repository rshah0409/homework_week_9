import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//Write a Java program to reverse an array of integer values.
public class ReverseArray3 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(11);
        list.add( 22 );
        list.add(33.33);
        list.add(44.44);
        list.add(55);
        list.add(66  );
        list.add(77);
        System.out.println("Original Array List    " +list);
        Collections.reverse(list);  //collection class for reverse arraylist
        System.out.println( "The Reverse list    "+list);


    }




}
