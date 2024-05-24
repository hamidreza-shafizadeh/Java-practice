package Exercise_3;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence_1,sentence_2;
        int i ;
        System.out.print("Enter the first sentence: ");
        sentence_1 = in.nextLine();
        System.out.print("Enter the second sentence : ");
        sentence_2 = in.nextLine();
        i = sentence_1.indexOf(sentence_2);
        if (i==-1)
            System.out.println("I found it");
        else
            System.out.println("I did not find it");
    }
}
