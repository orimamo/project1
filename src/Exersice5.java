import java.util.Scanner;

public class Exersice5 {
    public static int earnEmployees(int a, int b, int c) {
        int needByPaid = 0;
        if (a == 0) {
            needByPaid = (c * 250 + b * 50);
            return needByPaid;
        } else if (a == 1) {
            needByPaid = c * 250 + b * 200;
            return needByPaid;
        } else {
            System.out.println("there isn't employees like this :");
        }

        return needByPaid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the employees type (0-is a junior , 1-is a senior): ");
        int theEmployees = scanner.nextInt();
        System.out.println("enter how much hour he work at the month : ");
        int hoursAtWork;
        hoursAtWork= scanner.nextInt();
        System.out.println("enter how days he passed the limit: ");
        int limitDay;
        limitDay = scanner.nextInt();
        int sum;
        sum = earnEmployees(theEmployees, hoursAtWork ,limitDay);
        System.out.println("the value of want he need to get paid is :" + sum + " $");
    }



}
