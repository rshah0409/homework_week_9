
import java.util.Arrays;
public class ArrayReverse3 {
    public static void main(String[] args){
        int[] value = {
                100, 200, 300, 400, 500,
                600, 700, 800, 900, 1000};
        System.out.println("Original array : "+Arrays.toString(value));
        for(int i = 0; i < value.length / 2; i++)
        {
            int temp = value[i];
            value[i] = value[value.length - i - 1];   //this was from google but i also tried on my own in another programme.
            value[value.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(value));
    }






}
