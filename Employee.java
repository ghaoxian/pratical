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
public class Employee{
private String name;
private double salary;

public Employee()
{
        name = " ";
        salary = 0.0;
}

public Employee(String empName)
{
    name= empName;
    salary = 0.0;
}

public Employee(String employeeName, double currentSalary)
{
name = employeeName;
salary = currentSalary;
}

public void raiseSalary(double percent){
salary = salary + (salary * percent / 100.0);
}



public void setName(String n)
{
    name = n;
}

public void setSalary(double amount)
{
    salary = amount;
}

public String getName()
{
    return name;
}

public double getSalary()
{
    return salary;
}



}
