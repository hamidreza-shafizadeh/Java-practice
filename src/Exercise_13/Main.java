package Exercise_13;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s,s2;
        System.out.print("Reshte Ra Vared Konid : ");
        s = in.next();
        StringBuffer m1 = new StringBuffer(s);
        m1 =m1.reverse();
        s2 = m1.toString();
        if (s.compareTo(s2)==0)
            System.out.println("Yeksan Ast.");
        else
            System.out.println("Yeksan Nist");
    }
}
