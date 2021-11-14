import java.util.Scanner;

public class Exersice5 {
    public static void earnEmployees(int a, int b, int c) {
        int needByPaid = 0;
        int bonus = 250;
        int senior = 200;
        int junior = 50;
        if (a == 0)
        {
            needByPaid = (c * bonus) + (b * junior);
            System.out.println("the value of want he need to get paid is :" + needByPaid + " $");

        } else if (a == 1) {
            needByPaid = (c * bonus) + (b * senior);
            System.out.println("the value of want he need to get paid is :" + needByPaid + " $");

        } else {
            System.out.println("there isn't employees like this !");
        }


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check;
        do {
            System.out.println("enter the employees type (0-is a junior , 1-is a senior): ");
            int theEmployees = scanner.nextInt();
            System.out.println("enter how much hour he work at the month : ");
            int hoursAtWork;
            hoursAtWork = scanner.nextInt();
            System.out.println("enter how days he passed the limit: ");
            int limitDay;
            limitDay = scanner.nextInt();
            earnEmployees(theEmployees, hoursAtWork, limitDay);
            System.out.println("do you want to check other one? if yes press 1 else press 0");
            check = scanner.nextInt();
        } while (check == 1);



    }


}
