
package first.print.project;

import java.util.Scanner;

public class ControlStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer number:");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(+num+" is a even number.");
        } else {
            System.out.println(+num+" is a odd number.");
        }
     
    }

}
