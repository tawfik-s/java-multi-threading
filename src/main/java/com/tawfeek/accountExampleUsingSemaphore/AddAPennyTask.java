package com.tawfeek.accountExampleUsingSemaphore;

public class AddAPennyTask implements Runnable{
    private Account account;

    public AddAPennyTask(Account account){
        this.account=account;
    }

    @Override
    public void run() {
        account.deposit(1);
    }
}
