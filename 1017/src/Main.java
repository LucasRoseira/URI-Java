
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
        int a , b;
        double c;
        a = in.nextInt();
        b = in.nextInt();
        //calculations and operations
        c = b/12.0*a;
        //printing on the screen
        System.out.printf("%.3f\n", c);

    }
}
