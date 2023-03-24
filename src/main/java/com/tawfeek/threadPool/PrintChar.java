package com.tawfeek.threadPool;

import static java.lang.Thread.sleep;

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
