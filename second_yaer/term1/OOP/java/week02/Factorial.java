package week02;
import java.util.*;

public class Factorial {
    public static void main(String[] agrs) {
        int sum=0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1; i<=number; i++) {
            int plus = 1;
            for(int j=1; j<=i; j++){
                plus = plus * j;
            }
            sum += plus;
        }
        System.out.println(sum);
        input.close();
    }
}
