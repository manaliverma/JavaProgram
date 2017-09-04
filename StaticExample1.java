/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
public class StaticExample1 {
    static int a=3;
    static int b;
    
    static void func(int x)
    {
        System.out.println(" x= " + x);
        System.out.println(" a= " + a);
        System.out.println(" b= " + b);
    }
    
    static{
        System.out.println(" Static Bloc Instaticated ");
        b= a*4;
    }
    
    public static void main(String s[])
    {
        func(5);
    }
}
