// Write a Java program to iterate through all elements in an array list using  Iterator.


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator5 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("Sky");
        myList.add("is");
        myList.add("Blue");
        myList.add("and");
        myList.add("Sky");
        myList.add("has");
        myList.add(5);
        myList.add("Clouds");

        Iterator iMade = myList.iterator();    //iteration with ITERATOR.
          while(iMade.hasNext()){
              System.out.println( iMade.next() );

        }





    }



}
