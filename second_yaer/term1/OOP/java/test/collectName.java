package test;

import java.util.*;

public class collectName {
    public static void main(String[] agrs) {
        Scanner inputStr = new Scanner(System.in);
        int i=0;
        String[] arrName = new String[100];
        while (true) {
            String name = inputStr.nextLine();
            if (name.equals("end")) {
                break;
            } else {
                arrName[i] = name;
            }
            i++;
        }
        for(int j=0; j<=i; j++){
            System.out.println(arrName[j]);
        }
        inputStr.close();
    }
}
