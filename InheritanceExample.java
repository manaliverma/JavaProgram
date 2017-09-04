/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
class Box2{
    int l,b,h;
    
    Box2()
    {
        l=b=h=10;
    }
    Box2(Box2 obj)
    {
        l=obj.l; b=obj.b; h= obj.h;
    }
    Box2(int x)
    {
        l=b=h=x;
    }
    Box2(int x, int y, int z)
    {
        l=x; b=y; h=z;
    }
    int vol()
    {
        return l*b*h;
    }
}

class Color extends Box2{
    int c;
    
    Color()
    {
        c=10;
    }
    Color(Color obj)
    {
        l=obj.l; b=obj.b; h= obj.h; c=obj.c;
    }
    Color (int x)
    {
        c=x;
    }
    
    Color(int w, int x, int y, int z )
    {
        l=w; b=x; h=y; c=z;
    }
}
public class InheritanceExample {
    public static void main(String s[])
    {
        Color c1 = new Color();
        Color c2 = new Color(10, 20, 30, 40);
        Color c3 = new Color(1, 2, 3, 4);
        Color c4 = new Color(c3);
        Color c5 = new Color(5);
        
        System.out.println("Volume of Box for constant value= "+ c1.vol());
        System.out.println("Color of Box for constant value= "+ c1.c);
        
        System.out.println("Volume of Box for object value= "+ c4.vol());
        System.out.println("Color of Box for object value= "+ c4.c);
        
        System.out.println("Volume of Box for same value= "+ c5.vol());
        System.out.println("Color of Box for same value= "+ c5.c);
        
        System.out.println("Volume of Box for different value= "+c2.vol());
        System.out.println("Color of Box for different value= "+c2.c);
    }
}
