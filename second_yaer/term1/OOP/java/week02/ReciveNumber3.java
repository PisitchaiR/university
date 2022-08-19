package week02;

import java.util.*;

public class ReciveNumber3 {
    public static void main(String[] agts) {
        int first;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        first = number;
        while (true) {
            number = input.nextInt();
            if (number % 2 == 0 || number % 3 == 0) {
                break;
            }
        }
        System.out.println("Output is "+first);
        input.close();
    }
}
