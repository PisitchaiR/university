package week01;
import java.util.*;

public class CalculateOil {
    public static void main(String[] agrs){
        double result;
        Scanner input = new Scanner(System.in);
        double numberOfOil = input.nextDouble();
        result = numberOfOil*30;
        System.out.println(result);
        input.close();
    }
    
}
