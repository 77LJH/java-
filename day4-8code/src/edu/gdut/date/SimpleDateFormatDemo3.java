package edu.gdut.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        String starttime = "2020年10月10日 00:00:00";
        String endtime = "2020年10月10日 00:10:00";
        String time1= "2020年10月10日 00:05:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf.parse(starttime);
        Date end = sdf.parse(endtime);
        Date time = sdf.parse(time1);

        if(time.after(start) && time.before(end)){
            System.out.println("在时间范围内");
        }else{
            System.out.println("不在时间范围内");
        }
    }
}
