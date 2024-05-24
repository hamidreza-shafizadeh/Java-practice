package Exercise_7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence,sentence_2,temp;
        System.out.print("Enter the first sentence: ");
        sentence = in.next();
        System.out.print("Enter the Second sentence: ");
        sentence_2 = in.next();
        temp = sentence;
        sentence = sentence_2;
        sentence_2 = temp ;
        System.out.println("first sentence : "+sentence+"\nSecond sentence : "+sentence_2);
    }
}
