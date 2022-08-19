package week01;
import java.util.*;

public class CircleArea {
    public static void main(String[] agrs) {
        double area;
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        area = Math.pow(radius, radius)*Math.PI;
        System.out.println(area);
        input.close();
    }

}
