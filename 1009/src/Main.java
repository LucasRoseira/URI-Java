
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
        String nameFunc;
        double salary, salesMonth;
        //Values assaignment
        //Next Line is used to read Strings and 
        nameFunc = in.nextLine();
        salary = in.nextDouble();
        salesMonth = in.nextDouble();
        //Calculations
        salary += salesMonth * 0.15;
        //Printing on the screen
        System.out.printf("TOTAL = R$ %.2f\n", salary);
    }

}
