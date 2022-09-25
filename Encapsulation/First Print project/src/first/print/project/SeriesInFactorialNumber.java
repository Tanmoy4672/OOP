package first.print.project;

import java.util.Scanner;

public class SeriesInFactorialNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int totalprime = 0;
        System.out.print("Enter intial integer number:");
        int intitalNumber = input.nextInt();
        System.out.print("Enter last integer number:");
        int EndNumber = input.nextInt();

        for (int i = intitalNumber; i <= EndNumber; i++) {

            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                totalprime++;
            }
             count = 0;
        }
        System.out.println("Total prime number:"+totalprime);
    }
}
