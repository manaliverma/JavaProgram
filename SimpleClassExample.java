/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class Box{
    int len,bred,hgt;
}
public class SimpleClassExample {
   public static void main(String s[])
   {
       Box b1= new Box();
       Box b2= new Box();
       b1.len=2;
       b1.bred=3;
       b1.hgt=1;

       b2.len=4;
       b2.bred=5;
       b2.hgt=1;
       
       int vol=b1.len * b1.bred *b1.hgt;
       
       System.out.println(vol);
       
       vol= b2.len * b2.bred *b2.hgt;
       System.out.println(vol);
   }
}
