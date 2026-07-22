class Employee{
    String name ;
    String id ;
    String department ;
    static String company = " power Technologies" ;
    Employee(String name , String id , String department){
        this.name = name ;
        this.id = id ;
        this.department= department ;
    }
    void display(){
            System.out.println("==========================================================================================");
            System.out.println("\n(=Id Card Recipt=)") ;
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Id : " + id);
            System.out.println("Employee's Department: " + department);
            System.out.println("company name : " + company);
            System.out.println("==========================================================================================");
        }
}


public class Lecture4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("claude" , "01100110,01110101,01100011,01101011,01101011,00100000,01101111,01100110,01100110" , "product devlopers") ;
        Employee e2 = new Employee("chatgpt" , "01101110,01101001,01100111,01100111,01100001,00001010" , "research and analysis") ;
        Employee e3 = new Employee("riya" , "01100110,01101001,01101110,01100101,01110011,01101000,01111001,01110100,00001010" , "CHAIRMAN");
        Employee e4 = new Employee("tanmay" , "01101011,01101001,01101110,01100111,00001010" , "MANAGING DIRECTOR") ;
    
        e1.display();
        e2.display();
        Employee.company = "CYBREVA TECHNOLOGIES" ;
        System.out.println("Company overtaked by 'CYBREVA TECHNOLOGIES'"); 
        e3.display();
        e4.display();
    
    }
}
