package Exercise_1;
import java.util.*;
import java.text.*;
public class Time {
    public void Time(){
        Date now = new Date();
        DateFormat formatter = DateFormat.getTimeInstance();
        System.out.print("Log in time: "+formatter.format(now));
    }
}
