package tutorial1002;
import java.io.PrintStream;
import java.util.Scanner;
public class tut2q7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value in inch:");
    double inches=sc.nextDouble();

    double meters=inches*2.54/100;

    System.out.printf("%.2f inches = %.2f meters%n", inches, meters);

        sc.close();

    }
}
