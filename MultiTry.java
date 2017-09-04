/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
public class MultiTry {
    public static void main(String s[])
    {
        try{
            int len=s.length;
            System.out.println("Length of args: "+ len);
            int n=12/len;
            
            try{
                if(len==1)
                {    len=len/(len-len);
                     System.out.println("len= "+ len);
                }
                if(len==2)
                {
                    int c[]={10};
                    c[9]=89;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("After multiple try");
    }
}
