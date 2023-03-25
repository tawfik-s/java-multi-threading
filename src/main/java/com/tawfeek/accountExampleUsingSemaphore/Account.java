package com.tawfeek.accountExampleUsingSemaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private static Semaphore semaphore=new Semaphore(1);
    private int balance;

    public Account(){
        balance =0;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int value){    //signature that will case race condition
   // public synchronized void deposit(int value){  //signature that solve the race condition problem

        try{
            semaphore.acquire();
            balance+=value;
        }catch (Exception ex){

        }finally {
            semaphore.release();
        }
    }
}
