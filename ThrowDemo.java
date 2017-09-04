/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class ThrowDemo {
    static void test()
    {
        try{
            throw new NullPointerException("exception occur");
        }
        catch(NullPointerException e)
        {
            System.out.println("Inside catch "+e);
        }
    }
    public static void main(String s[])
    {
        test();
    }
    
}
