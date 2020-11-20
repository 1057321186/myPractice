package com.project.util;



import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 日期相关工具类
 */

public final class DateUtil {
    public static final String DATETIME_FOMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_FOMAT_PAYTIME = "yyyyMMddHHmmss";
    public static final String DATETIME_FORMAT_4_MONITOR = "yyyy/MM/dd HH:mm:ss";
    public static final String Mill_DATETIME_FORMAT_4_MONITOR = "yyyy/MM/dd HH:mm:ss.SSS";
    public static final String DATE_FOMAT = "yyyy-MM-dd";
    public static final String TIME_FOMAT = "HH:mm:ss";

    /**
     * 字符串转时间 yyyy-MM-dd HH:mm:ss
     * @param strDateTime
     * @return
     */
    public static Date parseDateTime(String strDateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FOMAT);
        Date date = null;
        try {
            date = sdf.parse(strDateTime);
        } catch (Exception e) {
//            log.error("日期转换异常",e);
        }
        return date;
    }

    /**
     * 字符串转时间 yyyyMMddHHmmss
     * @param strDateTime
     * @return
     */
    public static Date parseDateTimeByPayTime(String strDateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FOMAT_PAYTIME);
        Date date = null;
        try {
            date = sdf.parse(strDateTime);
        } catch (Exception e) {
//            log.error("日期转换异常",e);
        }
        return date;
    }

    public static Date parseDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FOMAT);
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
//            log.error("日期转换异常",e);
        }
        return date;
    }

    public static Date parseDate4Monitor(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(Mill_DATETIME_FORMAT_4_MONITOR);
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
//            log.error("日期转换异常",e);
        }
        return date;
    }

    /**
     * 将给定时间戳转成秒返回
     * @param timeStamp
     * @return
     */
    public static final long toSecond(long timeStamp) {
        return  timeStamp /1000;
    }

    /**
     * 将给定时间戳转成秒返回
     * @param date
     * @return
     */
    public static final long toSecond(Date date) {
        long time = date.getTime();
        return  time /1000;
    }

    /**
     * 获取当前时间戳，转成秒返回
     * @return
     */
    public static final long getSecond() {
        long now = System.currentTimeMillis();
        return now/1000;
    }

    // 获取当前系统日期
    public static String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FOMAT);
        return sdf.format(date);
    }

    // 获取当前系统时间
    public static String getCurrentDateTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FOMAT);
        return sdf.format(date);
    }

    /**
     * 获取下个月当前时间
     * @return
     */
    public static Date getNextMonthDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,1);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 基于当前时间，获取minute分钟之前的时间
     * @param minute
     * @return
     */
    public static Date minuteBefore(Integer minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,-minute);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 获取number天后的当前时间
     * @param number
     * @return
     */
    public static Date getDayDateAfter(Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,number);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 获取number分钟后的当前时间
     * @param number
     * @return
     */
    public static Date getMinuteDateAfterByTime(Date date,Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE,number);
        return calendar.getTime();
    }

    /**
     * 获取number小时后的当前时间
     * @param number
     * @return
     */
    public static Date getHourDateAfterByTime(Date date,Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY,number);
        return calendar.getTime();
    }

    /**
     * 获取传入日期,number天后的当前时间
     */
    public static Date getDayDateAfterByTime(Date date, Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,number);
        return calendar.getTime();
    }




    /**
     * 获取number月后的当前时间
     * @param number
     * @return
     */
    public static Date getMonthDateAfter(Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,number);
        Date date = calendar.getTime();
        return date;
    }
    /**
     * 获取传入时间number月后的时间
     * @param number
     * @return
     */
    public static Date getMonthDateAfter(Date startDate,Integer number) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.MONTH,number);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 根据传入时间，返回传入时间的当天结束时间
     * @param currentDate
     * @return
     */
    public static Date getEndTimeOfGivenTime(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 根据传入时间，返回传入时间的当天开始时间
     * @param currentDate
     * @return
     */
    public static Date getStartTimeOfGivenTime(Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * Date转字符串 yyyy-MM-dd HH:mm:ss
     * @param date
     * @return
     */
    public static  String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FOMAT);
        return sdf.format(date);
    }

    public static String formatDate4Monitor(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT_4_MONITOR);
        return sdf.format(date);
    }

    /**
     * Date转字符串 yyyy-MM-dd
     * @param date
     * @return
     */
    public static  String formatDay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FOMAT);
        return sdf.format(date);
    }

    /**
     * Date转字符串 yyyy-MM-dd
     * @param date
     * @return
     */
    public static  String formatTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(TIME_FOMAT);
        return sdf.format(date);
    }

    /**
     * 按照传入的格式化字符串，格式化日期对象
     * @param date
     * @param format
     * @return
     */
    public static String formatDateByParam(Date date,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 获取当前时间流水号
     * @return
     */
    public static final String getSerialNum() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String format = sdf.format(new Date());
        return format;
    }

    /**
     * 获取指定最后一天
     *
     */
    public static final String getInputEndMonthDate(String date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DATE_FOMAT);
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.add(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,0);
        String format = simpleDateFormat.format(calendar.getTime());
        return format;
    }

    /**
     * 获取某年某月的最大天数
     * @param year
     * @param month
     * @return
     */
    public static int getMonthMaxDay(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        //设置年份
        calendar.set(Calendar.YEAR,year);
        //设置月份
        calendar.set(Calendar.MONTH,month -1);
        //获取某月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
    /**
     * 获取两个日期之间的所有日期
     * @param start  起始日期
     * @param end   结束日期
     * @return
     */
    public static List<String> getDates(String start, String end){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FOMAT);
        List<String> list = new ArrayList<String>(); //保存日期集合
        try {
            Date date_start = sdf.parse(start);
            Date date_end = sdf.parse(end);
            Date date =date_start;
            Calendar cd = Calendar.getInstance();//用Calendar 进行日期比较判断
            while (date.getTime()<=date_end.getTime()){
                list.add(sdf.format(date));
                cd.setTime(date);
                cd.add(Calendar.DATE, 1);//增加一天 放入集合
                date=cd.getTime();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 计算两个时间的时间差
     * @param now
     * @param date
     * @return
     */
    public static String subTime(Date now,Date date) {
        String time = "";
        try{
            long l=now.getTime()-date.getTime();       //获取时间差
            long day=l/(24*60*60*1000);
            long hour=(l/(60*60*1000)-day*24);
            long min=((l/(60*1000))-day*24*60-hour*60);
            long second=(l/1000-day*24*60*60-hour*60*60-min*60);
            String hourStr = Long.toString(hour);
            String minStr = Long.toString(min);
            String secondStr =  Long.toString(second);
            if(hourStr.length()==1){
                hourStr = "0" + hourStr;
            }
            if(minStr.length()==1){
                minStr = "0" + minStr;
            }
            if(secondStr.length()==1){
                secondStr = "0" + secondStr;
            }
            time = hourStr+"小时"+minStr+"分"+secondStr+"秒";
        }catch(Exception e){
            e.printStackTrace();
        }
        return time;
    }

    /**
     * 将日期格式化成字符串
     * @param date 要格式化的日期
     * @param format 格式化字符串
     * @return 格式化后的字符串
     */
    public static final String convertDate2String(Date date,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 获取某年某月的第一天开始时间
     * @param year
     * @param month
     * @return
     */
    public static String getMonthBeginTime(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        //设置年份
        calendar.set(Calendar.YEAR,year);
        //设置月份
        calendar.set(Calendar.MONTH,month -1);
        //获取某月最小天数
        int firstDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最小天数
        calendar.set(Calendar.DAY_OF_MONTH, firstDay);
        // 设置时分秒
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        String s = convertDate2String(calendar.getTime(), DATETIME_FOMAT);
        return s;
    }

    /**
     * 获取某年某月的最后一天结束时间
     * @param year
     * @param month
     * @return
     */
    public static String getMonthEndTime(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        //设置年份
        calendar.set(Calendar.YEAR,year);
        //设置月份
        calendar.set(Calendar.MONTH,month -1);
        //获取某月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        // 设置时分秒
        calendar.set(Calendar.HOUR_OF_DAY,23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        String s = convertDate2String(calendar.getTime(), DATETIME_FOMAT);
        return s;
    }
    public static  String getTimeStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }
    public static String getEndTime(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(DATE_FOMAT);
        SimpleDateFormat format1 = new SimpleDateFormat(DATETIME_FOMAT);
        Calendar calendar = Calendar.getInstance();
        Date parse = format.parse(date);
        calendar.setTime(parse);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.SECOND, -1);
        parse = calendar.getTime();
        String result = format1.format(parse);
        return result;
    }
    public static Date getCurrentStartTime() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        date = calendar.getTime();
        return date;
    }

    public static Date getCurrentEndTime()  {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        date = calendar.getTime();
        return date;
    }

    public static Date getYesterdayStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    public static Date getYesterdayEndTime()  {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 获取传入日期的下一天开始时间
     * @param paramDate
     * @return
     */
    public static Date getNextDayStartTime(Date paramDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(paramDate);
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 获取传入日期的下一天结束时间
     * @param paramDate
     * @return
     */
    public static Date getNextDayEndTime(Date paramDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(paramDate);
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        Date date = calendar.getTime();
        return date;
    }

    public static Date getCurrentMonthStartTime() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        date = calendar.getTime();
        return date;
    }

    public static String getCurrentMonthStartDay() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        String s = formatDay(date);
        return s;
    }

    /**
     * 获取上个月开始日期
     * @return
     */
    public static String getLastMonthStartDay() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        String s = formatDay(date);
        return s;
    }

    public static Date getCurrentMonthEndTime() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //获取某月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND,0);
        date = calendar.getTime();
        return date;
    }

    public static String getCurrentMonthEndDay() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //获取某月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        date = calendar.getTime();
        String s = formatDay(date);
        return s;
    }

    /**
     * 获取上个月结束日期
     * @return
     */
    public static String getLastMonthEndDay() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        //获取某月最大天数
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        //设置日历中月份的最大天数
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        date = calendar.getTime();
        String s = formatDay(date);
        return s;
    }

    /**
     * 获取昨天日期
     * @return
     */
    public static String getYesterday(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        Date time = calendar.getTime();
        String yesterday = new SimpleDateFormat(DATE_FOMAT).format(time);
        return yesterday;
    }

    /**
     * 获取昨天日期
     * @return
     */
    public static Date getYesterdayDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        Date time = calendar.getTime();
        return time;
    }


    /**
     * 计算两个日期之间相差的天数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差天数
     * calendar 对日期进行时间操作
     * getTimeInMillis() 获取日期的毫秒显示形式
     */
    public static int daysBetween(Date smdate,Date bdate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个日期之间相差的分钟数
     * @param smdate 较小的时间
     * @param bdate  较大的时间
     * @return 相差分钟数
     * calendar 对日期进行时间操作
     * getTimeInMillis() 获取日期的毫秒显示形式
     */
    public static int minutesBetween(Date smdate,Date bdate) {
        long time1 = smdate.getTime();
        long time2 = bdate.getTime();
        long between = time2 - time1;
        long between_minutes = between / (1000 * 60);
        return Integer.parseInt(String.valueOf(between_minutes));
    }


    /**
     * 计算两个日期之间相差的分钟数
     * @param smdate
     * @param bdate
     * @return
     */
    public static long minBetween(Date smdate,Date bdate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (1000 * 60);
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个日期之间相差的秒数
     * @param smdate
     * @param bdate
     * @return
     */
    public static long secBetween(Date smdate,Date bdate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / 1000;
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     * @param nowTime 当前时间
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * @author jqlin
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断日期是否过期
     * @param expireDate
     * @return
     */
    public static boolean isExpire(Date expireDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date time = calendar.getTime();

        boolean before = expireDate.before(time);
        return before;
    }

    /**
     * 获取给定时间的小时数
     * @param date
     * @return
     */
    public static int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        return hour;
    }

    /**
     * 获取上个月的月份数
     * @return
     */
    public static int getMonthOfLastMonth() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        int month = calendar.get(Calendar.MONTH);
        return month + 1;
    }

    /**
     * 根据传入时间获取上个月的月份
     * @return
     */
    public static int getMonthOfLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        int month = calendar.get(Calendar.MONTH);
        return month + 1;
    }

    /**
     * 获取给定日期的月份数
     * @param date
     * @return
     */
    public static int getMonthOfGivenDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH);
        return month + 1;
    }

    /**
     * 获取上上个月的月份数
     * @return
     */
    public static int getMonthOfLastTwoMonth() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -2);
        int month = calendar.get(Calendar.MONTH);
        return month + 1;
    }

    /**
     * 获取上个月的年份
     * @return
     */
    public static int getYearOfLastMonth() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    /**
     * 根据传入时间获取上个月的年份
     * @return
     */
    public static int getYearOfLastMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    /**
     * 获取给定日期的年份
     * @param date
     * @return
     */
    public static int getYearOfGivenDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    /**
     * 获取上上个月的年份
     * @return
     */
    public static int getYearOfLastTwoMonth() {
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -2);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }

    /**
     * 判断给定时间是否是昨天
     * @param date
     * @return
     */
    public static boolean isYesterday(Date date) {
        // 获取昨天开始日期
        Date startTime = getYesterdayStartTime();
        String s1 = formatDay(startTime);
        String s2 = formatDay(date);
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断是否是上个月
     * @param year
     * @param month
     * @return
     */
    public static boolean isLastMonth(Integer year,Integer month) {
        int monthOfLastMonth = getMonthOfLastMonth();
        int yearOfLastMonth = getYearOfLastMonth();
        if (year == yearOfLastMonth && month == monthOfLastMonth) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断是否是当前月份
     * @param year
     * @param month
     * @return
     */
    public static boolean isCurrentMonth(Integer year,Integer month) {
        Date date = new Date();
        // 获取当前时间所在月份
        int currentMonth = getMonthOfGivenDate(date);

        // 获取当前时间所在年份
        int currentYear = getYearOfGivenDate(date);

        if (currentYear == year && currentMonth == month) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断给定时间是否大于等于当天
     * @param date
     * @return
     */
    public static boolean isGreatEqualCurrentDay(Date date) {
        // 获取给定日期一天的的开始时间
        Date startTime = getStartTimeOfGivenTime(date);

        // 获取昨天最大时间
        Date endTime = getYesterdayEndTime();
        if (startTime.after(endTime)) {
            return true;
        } else {
            return false;
        }
    }

//    /**
//     * 获取给定时间的年份、月份、日期
//     * @param date
//     * @return
//     */
//    public static YearMonthDay getYearMonthDay(Date date) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//
//        YearMonthDay yearMonthDay = new YearMonthDay();
//        int tempYear = calendar.get(Calendar.YEAR);
//        int tempMonth = calendar.get(Calendar.MONTH);
//        int tempDay = calendar.get(Calendar.DAY_OF_MONTH);
//        yearMonthDay.setYear(tempYear);
//        yearMonthDay.setMonth(tempMonth + 1);
//        yearMonthDay.setDay(tempDay);
//        return yearMonthDay;
//    }

    /**
     * 获取给定月份当月的天数
     * @param year
     * @param month
     * @return
     */
    public static Integer getDaysOfMonth(Integer year,Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    /**
     * 按给定的年月日，生成对应的日期
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Date getDateByParam(Integer year,Integer month,Integer day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month-1);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        Date time = calendar.getTime();
        return time;
    }


    /**
     * 判断日期date是否超过num天
     * @param date
     * @param num
     * @return
     */
    public static boolean isExceedNDay(Date date,Integer num) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-num);
        Date time = calendar.getTime();

        boolean before = date.before(time);
        return before;
    }

    /**
     * 获取两个时间相差的月份，不足一个月按一个月算
     * @param d1
     * @param d2
     * @return
     */
    public static int getMonthDiff(Date d1, Date d2) {
        int days = daysBetween(d2, d1);
        int a = days % 31;
        int b = days / 31;
        if (a > 0) {
            return b + 1;
        } else {
            return b;
        }
    }

    /**
     * 获取今天开始时间
     * @return 假设当天为28号，返回“2016-12-28 00:00:00”对应的日期
     */
    public static final Date getStartTimeCurrentDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND,0);
        return calendar.getTime();
    }

    /**
     * 获取日期
     * @return
     */
    public static final int getCurrentDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int date = calendar.get(Calendar.DATE);
        return date;
    }

    /**
     * 获取上月结算日
     * @param balanceDay 系统设置的结算日
     * @return
     */
    public static final Date getLastMonthBalanceDay(int balanceDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, balanceDay);
        return calendar.getTime();
    }


    /**
     * 获取本月结算日
     * @param balanceDay
     * @return
     */
    public static final Date getCurrentMonthBalanceDay(int balanceDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, balanceDay);
        return calendar.getTime();
    }

    /**
     * 判断当前时间距离第二天凌晨的秒数
     *
     * @return 返回值单位为[s:秒]
     */
    public static Long getSecondsNextEarlyMorning() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return (cal.getTimeInMillis() - System.currentTimeMillis()) / 1000;
    }
}
