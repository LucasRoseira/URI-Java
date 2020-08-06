
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Variable definitions
        Scanner in = new Scanner(System.in);
        String val1, val2;
        //Values assaignment
        val1 = in.nextLine();
        val2 = in.nextLine();
        //calculations and operations
        String arrayVal1[] = val1.split(" "); 
        String arrayVal2[] = val2.split(" "); 
        
        int codProd1 = Integer.parseInt(arrayVal1[0]);
        int amoutPiece1 = Integer.parseInt(arrayVal1[1]);            
        double priece1 = Double.parseDouble(arrayVal1[2]);
        
        int codProd2 =  Integer.parseInt(arrayVal2[0]);
        int amoutPiece2 = Integer.parseInt(arrayVal2[1]);
        double priece2 = Double.parseDouble(arrayVal2[2]);
        
        double Total = (amoutPiece1 * priece1)+(amoutPiece2 * priece2);
        //printing on the screen
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", Total);
    }
}
