/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL-PC
 */
public class ForEach {
    public static void main(String s[])
    {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        
        for (int x: nums)
        {
            System.out.println("Value of x: "+x);
            sum= sum+x;
        }
        System.out.println("Sum= " +sum);
    }
    
}
