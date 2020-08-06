
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
        int[] valores = new int[3];
        int maiorABC;
        String stringValores;
        //Values assaignment
        stringValores = in.nextLine();
        //calculations and operations

        String arrayValores[] = stringValores.split(" ");
        valores[0] = Integer.parseInt(arrayValores[0]);
        valores[1] = Integer.parseInt(arrayValores[1]);
        valores[2] = Integer.parseInt(arrayValores[2]);

        maiorABC = (valores[0] + valores[1] + Math.abs(valores[0] - valores[1])) / 2;
        maiorABC = (maiorABC + valores[2] + Math.abs(maiorABC - valores[2])) / 2;

        //printing on the screen
        System.out.println(maiorABC + " eh o maior");
    }
}
