/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class Excep extends Exception{
    int i;
    Excep(int x)
    {
        i=x;
    }
    public String toString()
    {
        return "Value= "+i;
    }
}

public class ExceptionExample {
    static void show(int x) throws Excep{
        System.out.println("Called show func: "+x);
        if(x < 10)
            throw new Excep(x);
        System.out.println("Exit");
    }
    
    public static void main(String s[])
    {
        try{
            show(50);
            show(3);
            show(100);
        }
        catch(Excep e)
        {
            System.out.println(e);
        }
    }
}
