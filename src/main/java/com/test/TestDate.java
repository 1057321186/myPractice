package com.test;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TestDate {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();

        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        System.out.println(new Date().getTime());
        long l = TimeUnit.MILLISECONDS.toSeconds(new Date().getTime());
        System.out.println(l);


        long startTime = 0;// 同步(上报)时间
        Long endTime = 0L;
        if(startTime == 0){
            System.out.println("--");
        }
    }
}
