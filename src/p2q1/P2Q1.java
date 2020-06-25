/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2q1;

/**
 *
 * @author Gan Hao Xian
 */
import java.lang.Math;
public class P2Q1 {

   
    
    
    public static void main(String[] args) 
    {
        
       
       displaySquare(20);
            
    }
    
    public static void displaySquare(int max)
    {
        int i;
         System.out.printf("Number     SquareRoot\n");
        for(i=0;i<=max;i+=2)
        {
            System.out.printf("%d\t%.4f\n",i,Math.sqrt(i));
        }
    }
    
}
