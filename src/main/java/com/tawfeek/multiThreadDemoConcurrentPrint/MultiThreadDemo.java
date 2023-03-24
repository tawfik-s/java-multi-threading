package com.tawfeek.multiThreadDemoConcurrentPrint;

import static java.lang.Thread.sleep;

public class MultiThreadDemo {
    public static void main(String[] args) {

        PrintChar task1=new PrintChar('a');
        PrintChar task2=new PrintChar('z');
        PrintNum  task3=new PrintNum(6);

        Thread thread1=new Thread(task1);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

    }


}
class PrintChar implements Runnable {
    private char myChar;

    public PrintChar(char myChar) {
        this.myChar = myChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(myChar);

        }
    }
}

class PrintNum implements Runnable{

    private int myNum;

    public PrintNum(int myNum){
        this.myNum=myNum;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.print(myNum);

        }
    }
}