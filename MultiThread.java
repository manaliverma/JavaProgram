/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class ThreadDemo implements Runnable{
   String name;
   Thread t;
   
   ThreadDemo(String s)
   {
       name=s;
       t= new Thread(this, name);
       System.out.println("New Thread: "+ t);
       t.start();
   }
   
   @Override
   public void run()
   {
       try{
           
           for (int i=0; i<5; i++)
           {
               System.out.println(name +" thread: "+ i);
               Thread.sleep(1000);
           }
           
       } catch (InterruptedException ex) {
           System.out.println(name + " Interrupt");
       }
       System.out.println(name +" Exit");
   }
}
public class MultiThread {
    public static void main(String s[])
    {
        new ThreadDemo("One");
        new ThreadDemo("Two");
        
        try{
            for(int i=0; i<5; i++)
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
