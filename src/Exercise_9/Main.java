package Exercise_9;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float nomre,n,jame=0,moadel;
        System.out.print("Tedad Moadel Ra Vared Konid : ");
        n = in.nextFloat();
        for (int i = 0;i<n;i++){
            System.out.printf("Moadel [%d] Ra Vared Konid : ",i+1);
            nomre = in.nextFloat();
            jame+=nomre;
        }
        moadel = jame/n;
        System.out.printf("Moadel Miangin Class = %.2f \n",moadel);
    }
}
