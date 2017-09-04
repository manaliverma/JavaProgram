/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class DemoThread extends Thread
{
    DemoThread()
    {
        super("Demo");
        System.out.println("Child Thread: "+ this);
        start();
    }
    public void run()
    {
        try{
            for (int i=0; i<5; i++)
            {
                System.out.println("Child Thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Interrupt");
        }
        System.out.println("Child Exit");
    }
}
public class ExtendThread {
    public static void main(String s[])
    {
        new DemoThread();
        
        try{
            for (int i=0; i<5; i++)
            {
                System.out.println("Main Thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Interrupt");
        }
        System.out.println("Main Exit");
    }
}
