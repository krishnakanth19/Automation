package com.automation.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDateAndTime(){
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    public static String getCurrentTime(){
        return new SimpleDateFormat("HHmmss").format(new Date());
    }

    public static String getCurrentDate(){
        return new SimpleDateFormat("MM/dd/yyyy").format(new Date());
    }

    public static String getMonth(){
        return new SimpleDateFormat("MM").format(new Date());
    }

    public static String getDayInTheYear(){
        return new SimpleDateFormat("DD").format(new Date());
    }

    public static String getYear(){
        return new SimpleDateFormat("YYYY").format(new Date());
    }
}
