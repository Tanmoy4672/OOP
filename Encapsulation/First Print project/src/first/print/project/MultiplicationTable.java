package first.print.project;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, multi,result;
        System.out.print("Enter any integer number:");
        multi = input.nextInt();
      
        

        for (i = 1; i<=10; i++) {
            result = multi * i;
            System.out.println(multi + " x " + i + " = " + result);
        }
        //System.out.println("Fctorial value of" + num + "=" + fact);
    }
}
