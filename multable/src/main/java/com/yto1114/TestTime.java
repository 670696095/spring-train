package com.yto1114;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2018/12/24 13:20
 */
public class TestTime {
    public static void main(String[] args) {


    long time=System.currentTimeMillis();
    Date date=new Date(time);
    SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
    String nwdate=format.format(date);
    int x=Integer.parseInt(nwdate);
    System.out.println(nwdate);
    System.out.println(x);
}
}
