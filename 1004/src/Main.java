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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        int a, b;
        //Values assaignment
        a = in.nextInt();
        b = in.nextInt();
        //Calculations
        a *= b;
        //Printing on the screen
        System.out.println("PROD = " + a);
    }
}
