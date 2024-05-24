package Exercise_6;
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence,m;
        int n1,n2;
        System.out.print("Enter the sentence: ");
        sentence = in.nextLine();
        System.out.print("Enter first number: ");
        n1 = in.nextInt();
        System.out.print("Enter Second number: ");
        n2=in.nextInt();
        m = Amaliat(sentence,n1,n2);
        System.out.printf("Separated string : %s \n",m);
    }
    public static String Amaliat(String s , int n1 , int n2){
        return s.substring(n1,n2);
    }
}
