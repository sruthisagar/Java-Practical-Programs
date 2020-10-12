class Employees
{
    String name, address;
    int age;
    long phoneNo;
    double salary;

    void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employees
{
    String specialization;

    Officer(String nm, int ag, long ph, String ad, double sl, String sp)
    {
        name = nm;
        age = ag;
        phoneNo = ph;
        address = ad;
        salary = sl;
        specialization = sp;
    }

    void display()
    {
        System.out.println("Officer Details \n_______________");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNo);
        System.out.println("Address: " + address);
        this.printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Manager extends Employees
{
    String department;

    Manager(String nm, int ag, long ph, String ad, double sl, String dp)
    {
        name = nm;
        age = ag;
        phoneNo = ph;
        address = ad;
        salary = sl;
        department = dp;
    }

    void display()
    {
        System.out.println("Manager Details \n_______________");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneNo);
        System.out.println("Address: " + address);
        this.printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class MultipleInheritance
{
    public static void main(String[] args)
    {
        Officer officer = new Officer("Deepak", 23, 4537622, "Kormangala, Banglore", 50000, "Artificial Intelligence");
        Manager manager = new Manager("Dingu", 25, 3294218, "HSR Layout, Banglore", 100000, "Information Technology");

        officer.display();
        manager.display();
    }
}
