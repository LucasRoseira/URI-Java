
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucas_000
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        double radius, area;
        //Values assaignment
        radius = in.nextDouble();
        //Calculations
        area = 3.14159 * Math.pow(radius, 2.0);
        //Printing on the screen
        System.out.printf("A=%.4f\n", area);
    }
}
