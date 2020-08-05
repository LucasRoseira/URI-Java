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
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        double a, b;
        //Values assaignment
        a = in.nextDouble();
        b = in.nextDouble();
        //Calculations
        a = ((a * 3.5) + (b * 7.5))/11;
        //Printing on the screen
        System.out.printf("MEDIA = %.5f\n", a);
    }
}
