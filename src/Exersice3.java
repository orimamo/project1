import java.util.Scanner;
import java.math.*;

import static java.lang.Math.max;

public class Exersice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int max;
        int min;
        int mid;
        System.out.println("enter the first num : ");
        firstNumber = scanner.nextInt();
        System.out.println("enter the second num : ");
        secondNumber = scanner.nextInt();
        System.out.println("enter the third num : ");
        thirdNumber = scanner.nextInt();
        max = Math.max(firstNumber , secondNumber);
        max = Math.max(max , thirdNumber);
        min = Math.min(firstNumber , secondNumber);
        min = Math.min(min , thirdNumber);
        if (firstNumber > min && firstNumber<max ){
            mid=firstNumber;
        }
        else if (secondNumber > min && secondNumber<max){
            mid = secondNumber;
        }
        else {
            mid = thirdNumber;
        }
        System.out.println(min + "," +  mid + "," + max );

    }

}
