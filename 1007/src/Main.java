
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
        int[] arr = new int[4];
        //Values assaignment
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        arr[2] = in.nextInt();
        arr[3] = in.nextInt();
        //Calculations
        arr[0] = (arr[0] * arr[1]) - (arr[2] * arr[3]);
        //Printing on the screen
        System.out.println("DIFERENCA = " + arr[0]);
    }

}
