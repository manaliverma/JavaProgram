/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
interface A{
    void pen();
    void paper();
}
interface B{
    void pencil();
}
class Show implements B{
    public void pen()
    {
        System.out.println("Pen");
    }
    @Override
    public void pencil()
    {
        System.out.println("Pencil");
    }
    public void paper()
    {
        System.out.println("Paper");
    }
}
public class ExtendInterface {
    public static void main(String sp[])
    {
        Show s = new Show();
        s.paper();
        s.pen();
        s.pencil();
    }
}
