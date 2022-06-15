package Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDome2 {
    public static void main(String[] args) throws ParseException {
        //计算某个时间点之后2天14小时49分06秒的时间是多少
        //把时间记录一下2022/03/28 11:11:11
        String date="2022年03月28日 11:11:11";
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        Date d=sdf.parse(date);
        long time =d.getTime()+(2L*24*60*60 + 14*60*60 + 49*60 + 11*60 +6)*1000;//加L防止数据溢出
        System.out.println(sdf.format(time));

    }
}
