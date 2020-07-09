/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

/**
 *
 * @author Gan Hao Xian
 */
public class P4 {


    public static void main(String[] args) 
    {
      
      Employee e1 = new Employee("Ali",5000.00);
      Employee e2 = new Employee("Abu");
      e2.setSalary(5600.00);
      
      if(e1.getSalary()>e2.getSalary())
      {
          System.out.println("Salary : "+e1.getSalary());
      }
      else
      {
          System.out.println("Salary : "+e2.getSalary());
      }
      
      
      
      System.out.println("Total Salary : "+(e1.getSalary()+e2.getSalary()));
      
      
     // e1.raiseSalary(8.0);
      
      //System.out.println("Salary : "+e1.getSalary());
    } 
}
