import java.util.Scanner;

public class Exersice9 {
    public static boolean division(int number1, int number2) {
        if (number1 % number2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int num) {
        int tester = 2;
        for (int i = 0 ; i < num-2 ; i++)
            if (division(num, tester+i )){
                return false ;
            }
        return true;
    }


    public static int positiveNum(int num4) {
        // int num = num4;
        Scanner scanner = new Scanner(System.in);
        while (num4 < 0) {
            System.out.println("Enter a positive number");
            num4 = scanner.nextInt();
            if (num4 <= 0) {
                System.out.println("Please enter a number above 0!");
                continue;
            }
        }
        return num4;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num1 = scanner.nextInt();
        int a = positiveNum(num1);
        for(int i = 2; i <= a; i++) {
            boolean flag2 = isPrime(i);
            if (flag2 == true) {
                System.out.print(i + ",");

            }

        }
    }
}
