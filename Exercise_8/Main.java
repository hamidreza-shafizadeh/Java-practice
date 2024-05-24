package Exercise_8;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, m;
        System.out.print("Jomle Ra Vared Konid : ");
        s = in.nextLine();
        m = Amaliat(s);
        System.out.printf("Jomle Ba Horof Bozorg : %s \n",m);
    }

    public static String Amaliat(String s) {
        return s.toUpperCase();
    }
}
