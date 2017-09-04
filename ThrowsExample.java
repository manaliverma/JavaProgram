/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class ThrowsExample {
    static void demo() throws IllegalAccessException{
        System.out.println("Inside demo func");
        throw new IllegalAccessException("execption occur");
    }
    public static void main(String s[]) 
    {
        try{
            demo();
        }
        catch(IllegalAccessException e)
        {
            System.out.println(e);
        }
    }
}
