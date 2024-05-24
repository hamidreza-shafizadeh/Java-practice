package Exercise_5;
import java.util.*;
import java.lang.*;
import java.text.DateFormat;
public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat f1 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat f2 = DateFormat.getTimeInstance(DateFormat.LONG);
        System.out.println("Date System : "+f1.format(now));
        System.out.println("Time System : "+f2.format(now));
    }
}
