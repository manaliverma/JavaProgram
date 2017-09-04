/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class TDemo implements Runnable{
    String name ;
    Thread t;
    
    TDemo(String s)
    {
        name=s;
        t= new Thread(this,name);
        System.out.println(name + " thread ");
        t.start();
    }
    public void run()
    {
        try{
            for(int i=0; i<5; i++)
            {
               System.out.println(name + " thread: "+ i);
               Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " Interrupt");
        }
        System.out.println(name + " Exit");
    }
}
public class WaitIsAliveThread {
    public static void main(String s[])
    {
        TDemo t1= new TDemo("One");
        TDemo t2= new TDemo("Two");
        TDemo t3= new TDemo("Three");
        
        System.out.println("Thread One isAlive: "+ t1.t.isAlive());
        System.out.println("Thread Two isAlive: "+ t2.t.isAlive());
        System.out.println("Thread Three isAlive: "+ t3.t.isAlive());
        
        //wait to join
        try{
            System.out.println("Waiting for threads to join");
            t3.t.join();
            System.out.println("Thread Three isAlive: "+ t3.t.isAlive());
            t2.t.join();
            System.out.println("Thread Two isAlive: "+ t2.t.isAlive());
            t1.t.join();
            System.out.println("Thread One isAlive: "+ t1.t.isAlive());
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupt");
        }
        
        System.out.println("After wait");
        System.out.println("Thread One isAlive: "+ t1.t.isAlive());
        System.out.println("Thread Two isAlive: "+ t2.t.isAlive());
        System.out.println("Thread Three isAlive: "+ t3.t.isAlive());
        
        System.out.println("Main exit");
    }
}
