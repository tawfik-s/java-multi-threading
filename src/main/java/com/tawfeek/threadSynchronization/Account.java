package com.tawfeek.threadSynchronization;

public class Account {
    private int balance;

    public Account(){
        balance =0;
    }

    public int getBalance(){
        return balance;
    }

    //public void deposit(int value){    //signature that will case race condition
    public synchronized void deposit(int value){  //signature that solve the race condition problem
        balance+=value;
    }
}
