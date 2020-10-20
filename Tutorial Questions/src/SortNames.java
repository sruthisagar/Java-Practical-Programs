import java.util.Scanner;

public class SortNames
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] nameOfStudents = new String[10];
        String temp;

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the names of the students");
        for (int i=0; i<n; i++)
            nameOfStudents[i] = sc.nextLine();

        for (int i=0; i<n-1; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if (nameOfStudents[i].compareTo(nameOfStudents[j]) > 0)
                {
                    temp = nameOfStudents[i];
                    nameOfStudents[i] = nameOfStudents[j];
                    nameOfStudents[j] = temp;
                }
            }
        }

        System.out.println("\nNames of the students in lexicographic order:");
        for (int i=0; i<n; i++)
            System.out.println(nameOfStudents[i]);
    }
}
