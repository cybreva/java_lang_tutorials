import java.util.Scanner ;
class Car {
    String brand ;
    String model ;
    int year ;
        Car(String x , String y ,int z){
            brand = x ;
            model = y ;
            year = z  ;
        }
        void display(){
            System.out.println("\n(=Car Details=)") ;
            System.out.println("car brand : " + brand);
            System.out.println("car model : " + model);
            System.out.println("car release year : " + year);
        }
}

public class Lecture2 {
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in) ;
        String brand = sc.next();
        String model = sc.next();
        int year = sc.nextInt();
        Car c1 = new Car(brand, model, year);
        c1.display();
        sc.close();
    }
}
