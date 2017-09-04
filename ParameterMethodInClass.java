/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
class BoxTest{
    int l,b,h;
    void setDim(int len, int bred, int hgt)
    {
        l=len;
        b=bred;
        h=hgt;
    }
    int vol()
    {
        return l*b*h;
    }
}
public class ParameterMethodInClass {
    public static void main(String s[])
    {
        BoxTest b1= new BoxTest();
        
        BoxTest b2= new BoxTest();
        
        b1.setDim(1, 2, 3);
        
        b2.setDim(4, 2, 3);
        
        int vol= b1.vol();
        
        System.out.println("Vol of Box1 = "+vol);
        
        System.out.println("Vol of Box2 = "+ b2.vol());
    }
    
}
