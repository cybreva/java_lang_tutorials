import java.util.Scanner ;
class Student {

    String name;
    int age;
    double height ;
}
public class LECTURE1 {
    //@SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter your age: ");
        s1.age = sc.nextInt();

        System.out.print("Enter your height: ");
        s1.height = sc.nextDouble();

        System.out.println("\nUser Details");

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Height: " + s1.height);

        sc.close();

    }
}
