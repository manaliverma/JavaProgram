/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WELCOME
 */
import helloworld.Balance;

public class ImportExample {
    public static void main(String s[])
    {
       // Balance b = new Balance("ABC", 10);
        
        Balance b[] = new Balance[3];
        b[0]= new Balance("ABC", 10);
        b[1]= new Balance("DEF", 20);
        b[2]= new Balance("PQR", 30);
        
        for(Balance i: b)
        {
            i.show();
        }  
          
    }
}
