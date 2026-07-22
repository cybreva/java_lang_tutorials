class Student {
    String name ;
    String roll_number ;
    String course ;

    Student(){
        name = "null" ;
        roll_number = "null" ;
        course = "how to be null" ;
    }
    Student(String name , String roll_number , String course){
        this.name = name ;
        this.roll_number = roll_number ;
        this.course= course ;
    }
    Student(String name , String roll_number){
        this.name = name ;
        this.roll_number = roll_number ;
    }
    void display() {
        System.out.println(name + " " + roll_number + " " + course);
    }
}
public class Lecture3 {
    public static void main(String[] args) {
        Student s3 = new Student();
        Student s1 = new Student("ravi" , "112341342" , "mathematical fuckkness");
        Student s2 = new Student("rajma chaval" , "45643596754");

        s1.display();
        s2.display();
        s3.display();
    }
    
}
