package Exercise_1;
import java.util.*;
public class Student {
    Scanner in = new Scanner(System.in);
    private String name;
    private String family;
    private String ID;
    public void Post (){
        System.out.print("enter your name: ");
        name = in.next();
        System.out.print("enter your family : ");
        family = in.next();
        System.out.print("enter your student ID: ");
        ID = in.next();
        Show();
    }
    public void Show(){
        System.out.println("****************************");
        System.out.printf("\nStudent name : %s %s \nStudent Family : %s \n",name,family,ID);
    }
}
