/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class MultiCatch {
    public static void main (String s[])
    {
        try{
            int len=1;
                    //s.length;
            System.out.println("Length of args: "+len);
            int n=12/len; 
            int c[]={9};
            c[8]=88;            
        }
        //System.out.println("After try");
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
                {
                System.out.println("Exception: "+e);
                }
        System.out.println("After catch");
    }
}
