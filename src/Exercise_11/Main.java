package Exercise_11;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        StringBuffer s = new StringBuffer();
        StringBuffer amalvand = new StringBuffer();
        StringBuffer amalgar = new StringBuffer();
        StringBuffer horof = new StringBuffer();// دستورالعمل اضافی برای حروف اضافه وارد شده در رشته
        System.out.print("Reshte Ra Vared Konid : ");
        s.append(in.next());
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
                amalgar.append(s.charAt(i));
            else if (s.charAt(i)>='0'&&s.charAt(i)<='9')
                amalvand.append(s.charAt(i));
            else
                horof.append(s.charAt(i));
        }
        System.out.println("Amalgarha :"+amalgar);
        System.out.println("Amalvand Ha :"+amalvand);
        System.out.println("Horof Ezafe :"+horof);
    }}

