package Thread2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepDemo {
    public static void main(String[] args)throws InterruptedException {
       /* int num=10;
        while(true){
            System.out.println(num--);
            Thread.sleep(1000);
            if(num<0){
                break;
            }
        }*/
        Date endTime=new Date(System.currentTimeMillis()+10*1000);
        long end=endTime.getTime();
        while(true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            endTime=new Date(end-1000);
            Thread.sleep(1);
            if(end-10000>endTime.getTime()){
                break;
            }
        }

    }
}
