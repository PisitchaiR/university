package week01;
import java.util.*;

public class CalVat {
    public static void main(String[] agrs){
        double result;
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        result = price + (price*7/100);
        System.out.println(result);
        input.close();
    }
}
