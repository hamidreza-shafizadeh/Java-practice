package Exercise_10;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Enter a string : ");
        str = in.next();
        StringBuffer s = new StringBuffer(str);
        System.out.print("String befor reverse : " + str);
        System.out.print("\nString after reverse : " + s.reverse());
    }
}
