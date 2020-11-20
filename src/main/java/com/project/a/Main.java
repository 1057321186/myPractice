package com.project.a;

import com.project.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Main {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        String lastday = format.format(cale.getTime());
        System.out.println(lastday);


        int monthMaxDay = DateUtil.getMonthMaxDay(2017, 2);
        System.out.println(monthMaxDay);
    }
}
