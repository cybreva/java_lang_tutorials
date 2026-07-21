import java.util.Scanner ;
class Bike {
    String brand ;
    String model ;
    int year ;
    double mileage ;
        Bike(String brand , String model ,int year ,double mileage ){
            this.brand = brand ;
            this.model = model ;
            this.year = year  ;
            this.mileage = mileage ;
        }
        void display(){
            System.out.println("\n(=Bike Details=)") ;
            System.out.println("Bike brand : " + brand);
            System.out.println("Bike model : " + model);
            System.out.println("Bike release year : " + year);
            System.out.println("Bike mileage : " + mileage);
        }
}

public class Lecture2 {
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in) ;
        System.out.print("\nenter brand name : ");
        String brand = sc.nextLine();
        System.out.print("\nenter model name : ");
        String model = sc.nextLine();
        System.out.print("\nenter release year : ");
        int year = sc.nextInt();
        System.out.print("\nenter milage : ");
        double mileage = sc.nextDouble();
        Bike c1 = new Bike(brand, model, year , mileage);
        c1.display();
        sc.close();
    }
}
