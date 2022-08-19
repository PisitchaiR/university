package week01;
import java.util.*;

public class CalculateScore {
    public static void main(String[] agrs) {
        double result;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        result = (x+y+z)/3;
        System.out.println(result);
        input.close();
    }
}
