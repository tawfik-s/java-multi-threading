package com.tawfeek.threadPool;

class PrintNum implements Runnable {

    private int myNum;

    public PrintNum(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(myNum);

        }
    }
}
