/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class BoxDemo{
    int l, b, h;
    
    int area()
    {
        return l*b;
    }
    
    void vol()
    {
        System.out.println("Volumne is " + (l*b*h));
    }
}
public class MethodInClass {
    public static void main (String s[]){
   BoxDemo b1= new BoxDemo();
   BoxDemo b2= new BoxDemo();
   
   b1.l=2;
   b1.b=3;
   b1.h=4;
   
   b2.l=5;
   b2.b=5;
   b2.h=5;
   
   b1.vol();
   System.out.println("Area is "+ b1.area());
   
   b2.vol();
   System.out.println("Area is "+ b2.area());
 }
}