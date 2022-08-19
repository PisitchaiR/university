package week01;
import java.util.*;

public class Area {
    public static void main(String[] agrs){
        double result;
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        result = side*side;
        System.out.println(result);
        input.close();
    }
}
