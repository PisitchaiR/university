import java.util.*;

public class GetLastNUmber4 {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        int last=0;
        while(true) {
            int number = input.nextInt();
            if(number == -1){
                break;
            }
            else{
                last = number;
            }
        }
        System.out.println(last);
        input.close();
    }
    
}
