package first.print.project;

public class BitwiseOperator {

    public static void main(String[] args) {
        int firstNumber = 32;
        int secondNumber = 12;

        int result;

        result = firstNumber & secondNumber;   //and=multiplication
        System.out.println("First Result:" + result);
        result = firstNumber | secondNumber; //or=summation
        System.out.println("Second Result:" + result);
        result = firstNumber ^ secondNumber;
        System.out.println("Third Result :" + result);
        result = firstNumber >> 3;    //gives the addition to decimal value
        System.out.println("Fourth result(>>):" + result);
        result = firstNumber << 3;
        System.out.println("Fifth result(<<):" + result);
    }

}
