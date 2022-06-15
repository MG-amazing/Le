package Data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs= sdf.format(d);
        System.out.println(rs);
        long time =System.currentTimeMillis()+121*1000;
        String rs2=sdf.format(time);
        System.out.println(rs2);
    }
}
