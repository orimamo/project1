import java.util.Scanner;

public class Exersice1
{
    public static void main(String[] args) {
        System.out.println("enter a number and I will tell you what is the Absolute value:");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        if (num < 0)
        {
            System.out.println("the Absolute value is :" + num * (-1));
        }
        else
        {
            System.out.println("the Absolute value is :" + num);

        }
    }
}
