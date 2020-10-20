class Employee
{
    void display()
    {
        System.out.println("Name of the class is Employee");
    }

    void calcSalary()
    {
        System.out.println("Salary of the employee is 10000");
    }
}

class Engineer extends Employee
{
    void calcSalary()
    {
        super.calcSalary();
        System.out.println("Salary of the employee is 20000");
    }
}

public class Inheritance
{
    public static void main(String[] args)
    {
        Engineer engineer = new Engineer();
        engineer.display();
        engineer.calcSalary();
    }
}
