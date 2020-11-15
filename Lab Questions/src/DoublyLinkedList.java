import java.util.*;

public class DoublyLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int choice, element;

        do
        {
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("\nEnter your choice");

            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("\nEnter the element");
                    element = sc.nextInt();
                    list.addFirst(element);
                    break;
                case 2:
                    System.out.println("\nEnter the element");
                    element = sc.nextInt();
                    list.addLast(element);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    if (list.isEmpty())
                        System.out.println("\nThe list is empty");
                    else
                    {
                        System.out.println("\nThe list is:");
                        for (Integer i : list)
                            System.out.print(i + " ");
                        System.out.println();
                    }
                    break;
            }
            System.out.println();
        }
        while (choice != 6);
    }
}
