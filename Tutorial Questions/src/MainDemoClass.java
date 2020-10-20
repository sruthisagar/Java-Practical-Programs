class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person
{
    int rollNo;
    String branch;

    Student(String name, int age, int rollNo, String branch)
    {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    void display()
    {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

class Employee extends Person
{
    int ecNo;
    String doj;

    Employee(String name, int age, int ecNo, String doj)
    {
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;
    }

    void display()
    {
        super.display();
        System.out.println("Employee Code No: " + ecNo);
        System.out.println("Date of joining: " + doj);
    }
}

class Staff extends Employee
{
    String designation;

    Staff(String name, int age, int ecNo, String doj, String designation)
    {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    void display()
    {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

class Faculty extends Employee
{
    String designation;

    Faculty(String name, int age, int ecNo, String doj, String designation)
    {
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    void display()
    {
        super.display();
        System.out.println("Designation: " + designation);
    }
}

public class MainDemoClass
{
    public static void main(String[] args)
    {
        Person person = new Person("Joey Tribbiani", 25);
        Student student = new Student("Monica Geller", 26, 12, "Computer Science");
        Employee employee = new Employee("Chandler Bing", 27, 52761, "22/09/1994");
        Staff staff = new Staff("Rachel Green", 26, 52766, "25/09/1994", "Technical");
        Faculty faculty = new Faculty("Phoebe Buffay", 26, 52775, "30/09/1994", "Professor");

        System.out.println("Person Details:");
        person.display();

        System.out.println("\nStudent Details:");
        student.display();

        System.out.println("\nEmployee Details:");
        employee.display();

        System.out.println("\nStaff Details:");
        staff.display();

        System.out.println("\nFaculty Details:");
        faculty.display();
    }
}
