/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class Box1{
    int l,b,h;
    Box1()
    {
        l=b=h=10;
    }
    Box1(int i, int j, int k)
    {
        l=i; b=j; h=k;
    }
    Box1(int len)
    {
        l=b=h=len;
    }
    int volume()
    {
        return l*b*h ;
    }
}
public class ConsOverload {
    public static void main(String s[])
    {
        Box1 b1= new Box1();
        Box1 b2= new Box1(2,3,4);
        Box1 b3= new Box1(5);
        
        System.out.println("Vol of box1= "+ b1.volume());
        
        System.out.println("Vol of box2= "+ b2.volume());
        
        System.out.println("Vol of box3= "+ b3.volume());
    }
}
