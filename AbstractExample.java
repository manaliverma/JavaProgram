/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
abstract class Figure{
    int l,b;
    Figure(int x, int y)
    {
        l=x;
        b=y;
    }
    abstract int area();
}
class Rectangle extends Figure{
    Rectangle(int i, int j)
    {
        super(i,j);
    }
    int area()
    {
        return l*b;
    }
}
class Triangle extends Figure{
    Triangle(int x, int y)
    {
        super(x,y);
    }
    int area()
    {
        return (l*b)/2;
    }
}
public class AbstractExample {
 public static void main (String s[])
 {
     Figure ref;
     Triangle t = new Triangle(10,20);
     Rectangle r = new Rectangle(5,15);
     
     ref= r;
     System.out.println(" Area of rectangle= " + ref.area());
     
     ref= t;
     System.out.println(" Area of triangle= " + ref.area());
 }
}
