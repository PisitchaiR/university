package week02;
import java.util.*;

public class Draw6 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = input.nextInt();
        for(int i=0; i<=number; i++) {
            if(i%5==0){
                System.out.print("/");
            }else{
                System.out.print("|");
            }
        }
    }
}
