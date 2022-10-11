import java.util.Scanner;

/**
 * This program is for the loan qualifier
 * and will have the logical OR (||) operator.
 * */

 public class loanqualifier{
    public static void main(String[] args) {
        //Variables.
        double salary;
        double yearsOnJob;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get the users salary.
        System.out.println("Enter you annual salary: \n");
        salary = keyboard.nextDouble();

        //Get the user's years on the job.
        System.out.println("Enter the years work for your current company: \n");
        yearsOnJob = keyboard.nextDouble();
        
    }
 }