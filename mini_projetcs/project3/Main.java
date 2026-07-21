package project3 ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int target ;
        System.out.print("welcome user\nplease enter the number whose multiplication table you want to see : ") ;
        target = sc.nextInt() ;
        for (int i = 1 ; i < 11 ; i++){
            System.out.println(target + " x " + i + " = " + target*i) ;
        }
        sc.close();
    }
}
