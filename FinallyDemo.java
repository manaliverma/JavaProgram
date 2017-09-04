/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class FinallyDemo {
    
    static void funcA()
    {
        throw new RuntimeException("exception occur");
    }
    static void funcB()
    {
        try{
            System.out.println("Inside B");
            return;
        }
        finally{
            System.out.println("Finally of B");
        }
    }
    static void funcC()
    {
        try{
            System.out.println("Inside C");
        }
        finally{
            System.out.println("Finally of C");
        }
    }
    public static void main(String s[])
    {
        try{
            funcA();
        }
        catch(RuntimeException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("Final A");
        }
        funcB();
        funcC();
    }
}
