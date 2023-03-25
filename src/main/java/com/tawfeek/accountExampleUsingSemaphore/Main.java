package com.tawfeek.accountExampleUsingSemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String [] args){
       ExecutorService executor= Executors.newCachedThreadPool();
       Account account=new Account();
        for(int i=0;i<10000;i++){
            executor.execute(new AddAPennyTask(account));
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println(account.getBalance());
    }
}
