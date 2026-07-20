package project1;
import java.util.Scanner;

class Student {

    String name ;
    int age ;
    double marks ;
    String grade ;

    void display(){
        System.out.println("\nUser Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
        System.out.println("Grades : " + grade);
}   }
public class Data {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        s1.name = sc.nextLine();

        System.out.print("Enter Your Age : ");
        s1.age = sc.nextInt();

        System.out.print("Enter Your Marks : ");
        s1.marks = sc.nextDouble();

        if(s1.marks < 0 || s1.marks > 100)
            {
                System.out.println("Invalid Input");
                sc.close();
                return;
            }
        else if(s1.marks >= 90)
            {
                s1.grade ="A+" ;
            }
        else if(s1.marks >= 80)
            {
                s1.grade = "A" ;
            }
        else if(s1.marks >= 70)
            {    
                s1.grade = "B" ;
            }
        else if(s1.marks >= 60)
            {   
                s1.grade = "C" ;
            }
        else if(s1.marks >= 50)
            {   
                s1.grade = "D" ;
            }
        else 
            {   
                s1.grade = "F" ;
            }

        s1.display();
        sc.close();
        
        
    }
}
