/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.Scanner;

/*
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
        int numFunc, hoursWorked;
        double valuePerHour;
        //Values assaignment
        numFunc = in.nextInt();
        hoursWorked = in.nextInt();
        valuePerHour = in.nextDouble();
        //Calculations
        valuePerHour *= hoursWorked;
        //Printing on the screen
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f\n", valuePerHour);
    }

}
