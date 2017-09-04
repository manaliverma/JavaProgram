/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class NewThread implements Runnable
{
    Thread t;
    
    NewThread()
    {
        t= new Thread(this, "Demo");
        System.out.println("Child Thread: " + t);
        t.start();
    }
    public void run()
    {
        try{
            for(int i=0; i<5; i++)
            {
                System.out.println("Child Thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Child Exit");
    }
}
public class RunnableThread {
    public static void main(String s[])
    {
        new NewThread();
        
        try{
            for(int i=0; i<5; i++)
            {
                System.out.println("Main Thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupted");
        }
        System.out.println("Main Exit"); 
    }
}
