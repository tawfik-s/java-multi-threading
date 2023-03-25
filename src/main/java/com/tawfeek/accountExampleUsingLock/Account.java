package com.tawfeek.accountExampleUsingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private static Lock lock=new ReentrantLock();
    private int balance;

    public Account(){
        balance =0;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int value){    //signature that will case race condition
   // public synchronized void deposit(int value){  //signature that solve the race condition problem
        lock.lock();
        try{
            balance+=value;
        }catch (Exception ex){

        }finally {
            lock.unlock();
        }
    }
}
