package project2;
import java.util.Scanner ;
class Client{
    String name ;
    String bank_accountNumber ;
    String pin ;
    void display(){
        System.out.println("\nUser Details");
        System.out.println("Name : " + name);
        System.out.println("Accoount Number : " + bank_accountNumber);
        System.out.println("Pin : " + pin);
    }

}
public class Bank {
    public static void main(String[] args) {
        Client c1 = new Client() ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        c1.name = sc.next();

        System.out.print("Enter Your Bank Account Number : ");
        c1.bank_accountNumber = sc.next();

        int attemps = 0 ;
        do{
            System.out.print("Enter Your Pin : ");
            c1.pin = sc.next();
            if(!c1.pin.equals("7221")){
                System.out.println("INVALID PIN , PLEASE TRY AGAIN . ");
            }
            else{
                System.out.println("AUTHENTICATION COMPLETED");
                System.out.println("PLEASE VERIFY YOUR DETAILS");
                c1.display();
                sc.close();
                return;
            }
            attemps++;
        }
        while(attemps<4) ;
        
        sc.close();
    }
}
