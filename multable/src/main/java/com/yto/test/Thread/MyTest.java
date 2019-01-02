package com.yto.test.Thread;

/**
 * @author czw
 */
public class MyTest extends Thread {
    private Account account;
    public MyTest(Account account,String name){
        super(name);
        this.account = account;
    }
    @Override
    public void run(){
        for(int i = 0;i < 10; i++){
            if(i == 6){
                account.setName(getName());
            }
            System.out.println(account.getName()+"账户的i值:"+i);
        }

    }

}
