package com.tawfeek.stringClassesComparison;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        //StringBuilder sb = new StringBuilder(); //not thread safe Time Taken:16
        StringBuffer sb = new StringBuffer(); //thread safe Time Taken:18  more time because of lock creation and release time
        //String st="";   //take 790 and memory 276386600
        for(int i = 0; i<100000; i++){  //use i limit to be 10000000 to see the def between builder and buffer
           sb.append(":");
            //st=st+":";
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(endMemory-startMemory));
    }
}
