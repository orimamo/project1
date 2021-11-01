import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Exersice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;
        System.out.println("enter the first num : ");
        firstNum = scanner.nextInt();
        System.out.println("enter the second num : ");
        secondNum = scanner.nextInt();
        if ((firstNum + secondNum) % 2 == 0){
            System.out.println("the sum is even number ");

        }
        else {
            System.out.println("the sum is odd number ");

        }
        }

}

