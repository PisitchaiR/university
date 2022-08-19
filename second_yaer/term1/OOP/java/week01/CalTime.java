package week01;
import java.util.*;

public class CalTime {
    public static void main(String[] agrs){
        int Secs;
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        int Hours = input.nextInt();
        System.out.print("Mins : ");
        int Mins = input.nextInt();
        Secs = (Hours*60)*60 + Mins*60;
        System.out.println("Secs = " + Secs);
        input.close();
    }
}
