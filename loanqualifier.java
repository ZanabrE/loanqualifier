import java.util.Scanner;

/**
 * This program is for the loan qualifier
 * and will have the logical OR (||) operator.
 * */

 public class loanqualifier{
    public static void main(String[] args) {
        //Header.
        System.out.print("****************************************\n");
        System.out.print("*          Loan Qualifier App          *\n");
        System.out.print("****************************************\n");
        
        //Variables.
        double salary;
        double yearsOnJob;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get the users salary.
        System.out.println("Enter you annual salary: ");
        salary = keyboard.nextDouble();

        //Get the user's years on the job.
        System.out.println("Enter the years work for your current company: ");
        yearsOnJob = keyboard.nextDouble();
        
        //Determine whether the user qualify for the loan.
        if(salary >= 50000 || yearsOnJob >= 2){
            System.out.println("You qualify for the loan.");
        }
        else{
            System.out.println("Sorry, you don't qualify for the loan.");
        }
    }
 }