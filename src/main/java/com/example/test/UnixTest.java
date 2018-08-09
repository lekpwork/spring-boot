package com.example.test;

import com.example.Log.LogUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/8/7</div>
 *
 * @author lekp
 * @since 1.0
 */
public class UnixTest {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = df.parse("2018-08-07");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long timestamp = cal.getTimeInMillis();

        Long da=new Date().getTime()/1000-timestamp/1000;
//
//        String a=new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(da);
//        LogUtil.debug(a);

        //
        String str = "221";
        long seconds = da;
        long temp=0;
        StringBuffer sb=new StringBuffer();
        temp = seconds/3600;
        sb.append((temp<10)?"0"+temp+":":""+temp+":");

        temp=seconds%3600/60;
        sb.append((temp<10)?"0"+temp+":":""+temp+":");

        temp=seconds%3600%60;
        sb.append((temp<10)?"0"+temp:""+temp);
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        Date date1=sdf.parse(sb.toString());
        LogUtil.debug(date1+"");
    }
}
