/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class SimpleException {
    public static void main(String s[])
    {
        int d,n;
        
        try{
            d=0;
            n=12/d;
            System.out.println("Not printed"); // wont be executed
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero: "+e);
        }
        System.out.println("After catch stmnt");
    }
    
}
