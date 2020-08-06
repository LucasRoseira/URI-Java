
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
        double[] lados = new double[3];
        String stringLados;
        //Values assaignment
        stringLados = in.nextLine();
        //calculations and operations

        String arrayLados[] = stringLados.split(" ");
        lados[0] = Double.parseDouble(arrayLados[0]);
        lados[1] = Double.parseDouble(arrayLados[1]);
        lados[2] = Double.parseDouble(arrayLados[2]);

        double triangulo = lados[0] * lados[2] / 2.0;
        double circulo = (3.4159 * lados[2] * lados[2]);
        double trapezio = ((lados[0] + lados[1]) / 2) * lados[2];
        double quadrado = lados[1] * lados[1];
        double retangulo = lados[0] * lados[1];
        //printing on the screen
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }

}
