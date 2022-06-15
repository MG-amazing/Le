package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDome3 {
    public static void main(String[] args) throws ParseException {
        //开始和结束时间
        String startTime = "2022-3-28 11:39:07";
        String endTime = "2022-3-29 11:39:07";

        String xiaoming = "2022-3-29 11:39:09";
        String xiaohong = "2022-3-28 11:41:11";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(startTime);
        Date d2=sdf.parse(endTime);
        Date d3=sdf.parse(xiaoming);
        Date d4=sdf.parse(xiaohong);
        if (d3.after(d1)&&d3.before(d2)){
            System.out.println("小明秒杀成功可以发货~");
        }else {
            System.out.println("小明秒杀失败");
        }
        if (d4.after(d1)&&d4.before(d2)){
            System.out.println("小红秒杀成功可以发货~");
        }else {
            System.out.println("小红秒杀失败");
        }

    }
}
