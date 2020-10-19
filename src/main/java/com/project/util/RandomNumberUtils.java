package com.project.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * 随机产生验证码
 */
public final class RandomNumberUtils {

    /**
     * 随机生成字符 或 者数字
     * @return
     */
    private static String getRandom(){
        String value = "";
        Random random = new Random();
        int gen = random.nextInt(2);
        String charOrNum = gen % 2 ==0 ? "char":"num";
        if ("char".equals(charOrNum)) {
            //字符
            int temp = random.nextInt(2)%2==0?65:97;
            int ascii = random.nextInt(26);
            value += (char)(ascii + temp);
        }else if ("num".equals(charOrNum)) {
            //是数字
            value += String.valueOf(random.nextInt(10));
        }
        return value;
    }

    /**
     * 随机生成字符串（包含字符和数字）
     * @param length 指定长度
     * @return 返回set
     */
    private static Set<String> getStrAndNum(int length) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            String value = getRandom();
            set.add(value);
        }
        //若生成的字符串没达到指定长度 继续生成
        if (set.size() < length) {
            String value = getRandom();
            set.add(value);
        }
        return set;
    }

    /**
     * 存放在set中的字符组拼接成字符串
     * @param set
     * @return
     */
    private static  String printSet(Set set){ //打印set的方法
        Iterator iterator = set.iterator();
        String value = "";
        while (iterator.hasNext()) {
           //String ele = (String) iterator.next();
           value += (String)iterator.next();
        }
        return value;
       }

    /**
     * 返回生成的随机字符串
     * @param length 指定随机字符串长度
     * @return 指定长度 大于零 返回指定长度随机字符，小于等于零 返回null
     */
    public static String getRandomString(int length){
        String value= "";
        if (length > 0) {
            //如果返回的字符串小于指定长度 重新生成
            if (value.length() < length) {
                Set<String> store = getStrAndNum(length);
                value = printSet(store);
            }
            return value;
        }else{
            return value;
        }
    }

    public static String getRandomNumCode(int number){
        String codeNum = "";
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            //目的是产生足够随机的数，避免产生的数字重复率高的问题
            int next = random.nextInt(10000);
//            System.out.println(next);
            codeNum+=numbers[next%10];
        }
        return codeNum;
    }


    public static void main(String[] args) {
        System.out.println("4位随机验证码：  " + getRandomString(4));
        System.out.println("5位随机验证码：  " + getRandomString(5));
        System.out.println("6位随机验证码：  " + getRandomString(6));
        System.out.println(getRandomNumCode(6));
    }
}