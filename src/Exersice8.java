import java.util.Scanner;

public class Exersice8 {
    public static void print(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return ;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("enter an number between 5 to 20:");
        num = scanner.nextInt();
        while (num < 5 || num > 20) {
            System.out.println("enter again!!!");
            System.out.println("enter an number between 5 to 20:");
            num = scanner.nextInt();
        }
        print(num);


    }

}
