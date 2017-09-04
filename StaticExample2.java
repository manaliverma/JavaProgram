/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class StaticDemo{
    static int a=10;
    static int b=20;
    
    static void func()
    {
        System.out.println(" a= " + a);
    }
}
public class StaticExample2 {
    public static void main(String s[])
    {
        StaticDemo.func();
        System.out.println(" b= "+ StaticDemo.b);
    }
}
