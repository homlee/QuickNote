package com.homlee.utils;

/**
 * Created by Homlee on 8/5/2016.
 */

public class StringHelper {

    public static boolean isNullOrEmpty(String input) {
        return (input == null || input.length() == 0);
    }

    public static String join(String[] source,String separator){
        if(source==null || source.length==0) return "";
        StringBuilder sb=new StringBuilder();
        for (String item : source) {
            sb.append(item);
            sb.append(separator);
        }
        return sb.toString().substring(0, sb.length() - 1);
    }


}
