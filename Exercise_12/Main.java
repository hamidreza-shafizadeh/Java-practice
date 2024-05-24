package Exercise_12;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        Scanner in = new Scanner(System.in);
        Integer n=0;
        StringBuffer r = new StringBuffer();
        StringBuffer t = new StringBuffer();
        System.out.print("Reshte Ra Vared Konid : ");
        r.append(in.nextLine());
        for (int i=0;i<r.length();i++){
            t = new StringBuffer("");
            if (r.charAt(i)>='0'&&r.charAt(i)<='9'){
                t.append(r.charAt(i));
                n = new Integer(t.toString());
                sum = sum+n;
            }
        }
        System.out.println("Natije : "+sum);
    }
}
