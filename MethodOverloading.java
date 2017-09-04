/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class Demo{
    void test()
    {
        System.out.println("No parameter ");
    }
    void test(int i, int j)
    {
        System.out.println(" i+j = "+ (i+j));
    }
    void test(double i)
    {
        System.out.println(" i= " +i);
    }
}
public class MethodOverloading {
    public static void main (String s[])
    {
        Demo d = new Demo();
        
        int i=10;
        
        d.test();
        d.test(2,3);
        d.test(i);
        d.test(12.1212);
    }
}
