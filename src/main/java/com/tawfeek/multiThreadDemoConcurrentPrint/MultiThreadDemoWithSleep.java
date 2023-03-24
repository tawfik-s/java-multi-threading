package com.tawfeek.multiThreadDemoConcurrentPrint;

import static java.lang.Thread.sleep;

public class MultiThreadDemoWithSleep {
    public static void main(String[] args) {

        //it will be like round-robin because of sleep
        PrintCharWithSleep task1=new PrintCharWithSleep('a');
        PrintCharWithSleep task2=new PrintCharWithSleep('z');
        PrintNumWithSleep  task3=new PrintNumWithSleep(6);

        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
class PrintCharWithSleep implements Runnable {
    private char myChar;

    public PrintCharWithSleep(char myChar) {
        this.myChar = myChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(myChar);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class PrintNumWithSleep implements Runnable{

    private int myNum;

    public PrintNumWithSleep(int myNum){
        this.myNum=myNum;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(myNum);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}