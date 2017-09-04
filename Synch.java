/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class Callme
{  
    //synchronized void show(String msg) 
    void show(String msg)
    {
        System.out.println("[ " + msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(msg + " Interrupt");
        }
        System.out.println(" ]");
    }
}

class Caller implements Runnable
{
    String s;
    Thread t;
    Callme c;
    
    public Caller(Callme obj, String str)
    {
        c=obj;
        s=str;
        t= new Thread(this);
        t.start();
    }
    
    public void run()
    {
        synchronized(c)
                {
                    c.show(s);
                }
        //c.show(s);
    }
}
public class Synch {
    public static void main(String s[])
    {
        Callme call = new Callme();
        Caller ob1 = new Caller(call,"Hello");
        Caller ob2 = new Caller(call,"Synch");
        Caller ob3 = new Caller(call,"World");
        
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}
