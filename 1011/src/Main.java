
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucas_000
 */
public class Main {

    //(4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        double raio;
        //Values assaignment
        raio = in.nextInt();
        //calculations and operations
        raio = (4 / 3.0) * 3.14159 * Math.pow(raio, 3.0);
        //printing on the screen
        System.out.printf("VOLUME = %.3f\n", raio);
    }

}
