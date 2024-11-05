import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {

     String manager = "John";
     String salesmanager = "Mary";
     String headOfManagers = "Jane";

        System.out.println(manager);
        System.out.println(salesmanager);
        System.out.println(headOfManagers);
        int lengthOfManager = manager.length();
        System.out.println(lengthOfManager);
        int lengthOfManager1 = salesmanager.length();
        System.out.println(lengthOfManager1);
        int lengthOfManager2 = headOfManagers.length();
        System.out.println(lengthOfManager2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("Enter Your age: ");
        int age = scanner.nextInt();
        System.out.println(age);

        scanner.close();


    }
}
