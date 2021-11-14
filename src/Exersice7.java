import java.util.Scanner;

public class Exersice7 {
    public static void govermentOfficeMeeting(int day, int earlyHour, int lateHour) {
        if (day > 8) {
            System.out.println("there isn't day like this !!!");
        }
        if (earlyHour > lateHour) {
            System.out.println("early hour can't be bigger than late hour");
        }
        if (earlyHour < 0 || earlyHour > 23 && lateHour < 0 || lateHour > 23) {
            System.out.println("this hour can't be... ");
        }
        if (day == 6 || day == 7) {
            System.out.println("the office is closed!!!!");
            return;
        }
        if (day <= 5 || day > 0) {
            if ((day == 1 || day == 2 || day == 4 || day == 5) && (earlyHour < 9) || (lateHour > 17)) {
                System.out.println("this hour can't be... \nthe office is open only from 9 to 17 o'clock");
                return;

            } else if ((day == 3) && ((earlyHour < 8) || (lateHour > 12))) {
                System.out.println("this hour can't be... \nthe office is open only from 8 to 12 o'clock");
                return;
            }

            System.out.println("your meeting is in : " + day + " between " + earlyHour + ":00 to " + lateHour +":00");
        }

    }

    public static void main(String[] args) {
        System.out.println("hello to the goverment office \nopening hours in days sunday,monday,wednsday,thursday is between 09:00-17:00\nat tuesday is between 08:00-12:00 \nan friday and saturday the office is cloesd!! ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day of meeting ");
        int day = scanner.nextInt();
        System.out.println("enter the early hour of meeting ");
        int earlyHour = scanner.nextInt();
        System.out.println("enter the late hour of meeting ");
        int lateHour = scanner.nextInt();
        govermentOfficeMeeting(day, earlyHour, lateHour);


    }
}
