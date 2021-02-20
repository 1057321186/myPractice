package com.project.a;

import com.pojo.dto.StudentDTO;
import com.project.util.DateUtil;
import com.test.TestString;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;


public class Main {



    public static void main(String[] args) {

        TestString testString = new TestString();
        testString.testStringAndStringBuilder();


        StudentDTO dto = new StudentDTO();
        System.out.println("xixi".equals(dto.getName()));
        System.out.println(dto.getName().equals("xix"));


        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        String lastday = format.format(cale.getTime());
        System.out.println(lastday);

        // 获取某年某月最大日期
        int monthMaxDay = DateUtil.getMonthMaxDay(2017, 2);
        System.out.println(monthMaxDay);


        // 替换指定位置字符串
        String str = "12345";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(0,1,"*");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());


        StringBuilder stringBuilder2 = new StringBuilder();
//        String s =null;
//        stringBuilder2.append(s);

        Integer a =100;
        Integer b=3;
        System.out.println(6333/2000);
        if(a - b >1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        StringBuffer s = new StringBuffer();
        s.reverse();

    }
}
