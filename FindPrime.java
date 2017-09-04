/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
import java.util.*;

public class FindPrime {
    public static void main (String s[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter no: ");
      int n=sc.nextInt();
      
      int i;
      boolean b=true;
      
      for(i=2; i<=n/i; i++)
      {
          if((n%i)==0)
          {
             b= false;;
             break;
          }
      }
      if(b)
          System.out.println("Prime");
      else
          System.out.println(" Not Prime");
    }
    
}
