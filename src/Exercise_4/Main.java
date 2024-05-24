package Exercise_4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String sentence;int number;
        System.out.print("Enter the sentence: ");
        sentence = in.next();
        Integer num = new Integer(Integer.parseInt(sentence));
        System.out.printf("String converted to number: %d \n",num);
        System.out.print("enter number: ");
        number = in.nextInt();
        Integer num2 = new Integer(Integer.toString(number));
        System.out.printf("Number converted to string: %d \n",num2);
    }
}
