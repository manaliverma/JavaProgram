/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class Test{
    int a, b;
    Test(int i, int j)
    {
        a=i; b=j;
    }
    boolean equals(Test t)
    {
        if(t.a==a && t.b==b)
            return true;
        else
            return false;
    }
}
public class EqualOverload {
    public static void main(String sp[])
    {
        Test t1 = new Test(100, 20);
        
        Test t2 = new Test(100, 20);
        
        Test t3 = new Test(10, 2);
        
        System.out.println( " t1 == t2 : " + t1.equals(t2));
        
        System.out.println( " t2 == t3 : " + t2.equals(t3));
    }
}
