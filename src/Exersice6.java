import java.util.Scanner;

public class Exersice6 {
    public static void invoiceSeries(int a, int b, int c) {
        int i;
        for (i = 0; i < c; i++) {
            System.out.print(a + " , ");
            a = a + b;
        }
        return ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first num in the series");
        int firstNum = scanner.nextInt();
        System.out.print("enter the remainder :");
        int remainder = scanner.nextInt();
        System.out.print("enter the length of the series :");
        int lengthOfSeries = scanner.nextInt();
        if (lengthOfSeries > 0) {

            invoiceSeries(firstNum, remainder, lengthOfSeries);
        }


    }
}
