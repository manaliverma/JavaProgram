/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class Box3{
    int l,b,h;
    
    Box3()
    {
        l=b=h=10;
    }
    Box3(Box3 obj)
    {
        l=obj.l; b=obj.b; h= obj.h;
    }
    Box3(int x)
    {
        l=b=h=x;
    }
    Box3(int x, int y, int z)
    {
        l=x; b=y; h=z;
    }
    int vol()
    {
        return l*b*h;
    }
}

class Color3 extends Box3{
    int c;
    
    Color3()
    {
        super();
        c=10;
    }
    Color3(Color3 obj)
    {
        super(obj);
        c=obj.c;
    }
    Color3 (int x)
    {
        super(x);
        c=x;
    }
    
    Color3(int w, int x, int y, int z )
    {
        super(w,x,y);
        c=z;
    }
}
public class SuperExample {
    public static void main(String s[])
    {
        Color3 c1 = new Color3();
        Color3 c2 = new Color3(10, 20, 30, 40);
        Color3 c3 = new Color3(1, 2, 3, 4);
        Color3 c4 = new Color3(c3);
        Color3 c5 = new Color3(5);
        
        System.out.println("Volume of Box for constant value= "+ c1.vol());
        System.out.println("Color3 of Box for constant value= "+ c1.c);
        
        System.out.println("Volume of Box for object value= "+ c4.vol());
        System.out.println("Color3 of Box for object value= "+ c4.c);
        
        System.out.println("Volume of Box for same value= "+ c5.vol());
        System.out.println("Color3 of Box for same value= "+ c5.c);
        
        System.out.println("Volume of Box for different value= "+c2.vol());
        System.out.println("Color3 of Box for different value= "+c2.c);
    }
}