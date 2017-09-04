/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class Demo1{
    int a;
    Demo1(int i)
    {
        a=i;
    }
    Demo1 inc()
    {
        Demo1 temp = new Demo1(a+10);
        return temp;
    }
}
public class ReturnObj {
   public static void main(String s[])
   {
       Demo1 d1= new Demo1(2);
       Demo1 d2;
       
       d2= d1.inc();
       System.out.println(" d1.a = " + d1.a);
       System.out.println(" d2.a = " + d2.a);
       
       d2= d2.inc();
       System.out.println(" d2.a = " + d2.a);
   }
}
