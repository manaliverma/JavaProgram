/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
import java.util.Random;

interface Var{
    int No=1;
    int Yes=2;
    int Never=3;
    int Always=4;
}

class Question implements Var
{
    Random rand = new Random();
    int p= (int) (rand.nextDouble()*100);
    
    int ask()
    {
       if (p < 30)   
           return No;
       else if(p < 60)         
           return Yes;
       else if(p < 80)
           return Always;         
       else
           return Never;
    }
}

public class VariableInInterface implements Var
{
    static void ans(int ch)
    {   
        switch(ch)
        {
            case 1: System.out.println("No");
                     break;
            case 2: System.out.println("Yes");
                     break;
            case 3: System.out.println("Never");
                     break;
            case 4: System.out.println("Always");
                     break;
            default: System.out.println("Wrong entered");
                     break;
        }
    }
    public static void main(String s[])
    {
        Question q = new Question();
        System.out.println("p= "+ q.p);
        ans(q.ask());
    }
}
