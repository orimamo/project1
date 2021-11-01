import java.util.Scanner;
import java.math.*;

public class Exersice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a :");
        double a = scanner.nextDouble();
        System.out.println("enter the value of b :");
        double b = scanner.nextDouble();
        System.out.println("enter the value of c :");
        double c = scanner.nextDouble();
        double d = b * b - 4.0 * a * c;
        if(d>0) {
            double r1=(-b + Math.sqrt(d))/2.0*a;
            double r2=(-b - Math.sqrt(d))/2.0*a;
            System.out.println(" the result is \n`1:" + r1 + "\n2:"+ r2 );
        }
        else if (d==0){
            double r1 = (-b / 2.0*a);
            System.out.println(" the result is " + r1 );

        }
        else {
            System.out.println(" there isn't solution to this question!");

        }


    }


}
