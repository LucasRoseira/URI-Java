
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
        int totalDistance;
        double totalFuel;
        //Values assaignment
        totalDistance = in.nextInt();
        totalFuel = in.nextDouble();
        //calculations and operations
        totalFuel = totalDistance / totalFuel;
        //printing on the screen
        System.out.printf("%.3f km/l\n", totalFuel);
    }
}
