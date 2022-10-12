import java.util.Scanner;
/**
 * This program is for the loan qualifier
 * and will have the logical OR (||) operator.
 * */

 public class loanqualifier{
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Header.
        System.out.print("****************************************\n");
        System.out.print("*          Loan Qualifier App          *\n");
        System.out.print("****************************************\n");

        //Variables.
        double salary;
        double yearsOnJob;
        double creditScore;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get the users salary.
        System.out.println("Enter you annual salary: ");
        salary = keyboard.nextDouble();
        System.out.print("****************************************\n");
        //Get the user's years on the job.
        System.out.println("Enter the years work for your current company: ");
        yearsOnJob = keyboard.nextDouble();
        System.out.print("****************************************\n");
        //Get the usre's credit score.
        System.out.println("Enter your credit score: ");
        creditScore = keyboard.nextDouble();
        
        System.out.print("****************************************\n");
        //Determine whether the user qualify for the loan.
        if(salary >= 50000 || yearsOnJob >= 2 || creditScore >= 670){
            System.out.println("You qualify for the loan.");

            //Determine the user's credit score.
            if(creditScore >= 800 || creditScore >= 850){
                System.out.println("Exceptional.");
                System.out.println("21% individuals with an exceptional FICO Score.");
            }
            else if(creditScore >= 740 || creditScore >= 799){
                System.out.println("Very Good.");
                System.out.println("25% individuals with very good FICO Score.");
            }
            else if(creditScore >= 670 || creditScore >= 739){
                System.out.println("Good.");
                System.out.println("21% individuals with good FICO Score.");
            }
            else if(creditScore >= 580 || creditScore >= 669){
                System.out.println("Fair.");
                System.out.println("17% individuals with fair FICO Score.");
            }
            else if(creditScore >= 300 || creditScore >= 579){
                System.out.println("Poor.");
                System.out.println("16% inidividuals with poor FICO Score.");
                System.out.println("Please try to improve your FICO Score.");
            }
            else{
                System.out.println("Please fix your FICO Score.");
            }
        }
        else{
            System.out.println("Sorry, you don't qualify for the loan.");
        }
        keyboard.close();
    }
 }