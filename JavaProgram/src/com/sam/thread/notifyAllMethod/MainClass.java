package com.sam.thread.notifyAllMethod;
public class MainClass 
{   
    public static void main(String[] args) 
    {
        final Shared s = new Shared();
         
        //Thread t1 will be waiting for lock of object 's'
         
        Thread t1 = new Thread() 
        {
            @Override
            public void run()
            {
                s.waitMethod();
            }
        };
         
        t1.start();
         
        //Thread t2 will be waiting for lock of object 's'
         
        Thread t2 = new Thread() 
        {
            @Override
            public void run()
            {
                s.waitMethod();
            }
        };
 
        t2.start();
         
        //Thread t3 will be waiting for lock of object 's'
         
        Thread t3 = new Thread() 
        {
            @Override
            public void run()
            {
                s.waitMethod();
            }
        };
         
        t3.start();
         
        try
        {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        //Thread t4 will notify all threads which are waiting for lock of object 's'
         
        Thread t4 = new Thread() 
        {
            @Override
            public void run()
            {
                s.notifyAllThread();
            }
        };
         
        t4.start(); 
    }    
}