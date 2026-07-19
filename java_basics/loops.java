package java_basics;
public class loops {
    public static void main(String[] args){

        //for loop
        for (int x = 1; x <= 5; x++) {
            System.out.println(x);
        }
        //do-while loop
        int i = 10;

        do {
            System.out.println(i);
        } while (i < 5);
        //break
        for(int z=1;z<=10;z++){

            if(z==5){
                break;
            }

            System.out.println(z);
        }
    }
}
