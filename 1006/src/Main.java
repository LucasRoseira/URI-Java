
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        double a, b, c;
        //Values assaignment
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        //Calculations
        a = ((a * 2) + (b * 3) + (c * 5)) / 10;
        //Printing on the screen
        System.out.printf("MEDIA = %.1f\n", a);
    }

}
