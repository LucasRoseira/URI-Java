
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
        double[] valores = new double[4];
        String stringValores1, stringValores2;
        //Values assaignment
        stringValores1 = in.nextLine();
        stringValores2 = in.nextLine();

        //calculations and operations
        String arrayValores1[] = stringValores1.split(" ");
        String arrayValores2[] = stringValores2.split(" ");
        valores[0] = Double.parseDouble(arrayValores1[0]);
        valores[1] = Double.parseDouble(arrayValores1[1]);

        valores[2] = Double.parseDouble(arrayValores2[0]);
        valores[3] = Double.parseDouble(arrayValores2[1]);

        valores[0] = Math.sqrt(Math.pow(valores[2] - valores[0], 2.0)
                + Math.pow(valores[3] - valores[1], 2.0));
        //printing on the screen
        System.out.printf("%.4f\n", valores[0]);
    }
}
