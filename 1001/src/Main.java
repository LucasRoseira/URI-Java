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
        int a, b;
        //Values assaignment
        a = in.nextInt();
        b = in.nextInt();
        //Calculations
        a += b;
        //Printing on the screen
        System.out.println("X = " + a);
    }
}