package com.tawfeek.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

public class main {
    public static void main(String [] args){
        //newCachedThreadPool for dynamic size thread pool
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        executorService.execute(new PrintChar('a'));
        executorService.execute(new PrintChar('z'));
        executorService.execute(new PrintNum(1));
        executorService.execute(new PrintChar('y'));
        /**
         * The shutdown() method in line 14 tells the executor to shut down. No new tasks can be
         * accepted, but any existing tasks will continue to finish
         */
        executorService.shutdown();

    }
}

