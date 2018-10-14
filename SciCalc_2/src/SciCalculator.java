import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args){
        double numOne;
        double numTwo;
        double result = 0.0;
        int choice = 0;
        boolean startOfProgram = true;
        double sum = 0.0;
        int numCalc = 0;
        boolean onOff = true;
        int attempts = 0;
        // Declaring all variable that will be used in our execution

        Scanner input = new Scanner(System.in);

        while (onOff){
            if (attempts == 0){
                System.out.println("Current Result: " + result); }
            if (choice >= 1 && choice <= 6){
                System.out.println("Current Result: " + result); }
            if(choice > 0 && choice <= 6 || startOfProgram == true) {
                startOfProgram = false;
                printMenu(); }
            System.out.print("Enter Menu Selection: " );
            choice = input.nextInt();
            if (choice == 0){
                System.out.println("Thanks for using this calculator. Goodbye!");
                System.exit(0); }
        // Conditions for which our commands will execute

            switch (choice){
                case 1: //Addition Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = numOne + numTwo;
                    sum += result;
                    numCalc = (numCalc +1);
                    attempts += 1;
                    break;
                case 2: //Subtraction Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = numOne - numTwo ;
                    attempts += 1;
                    sum += result;
                    numCalc = (numCalc +1);
                    break;
                case 3: //Multiplication Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = numOne * numTwo;
                    attempts += 1;
                    sum += result;
                    numCalc = (numCalc +1);
                    break;
                case 4: //Division Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = numOne / numTwo;
                    attempts += 1;
                    sum += result;
                    numCalc = (numCalc +1);
                    break;
                case 5: //Exponentiation Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = Math.pow(numOne,numTwo);
                    attempts += 1;
                    sum += result;
                    numCalc = (numCalc +1);
                    break;
                case 6: //Logarithmic Case
                    System.out.print("Enter first operand: ");
                    numOne = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numTwo = input.nextDouble();
                    result = Math.log(numTwo)/Math.log(numOne) ;
                    attempts += 1;
                    sum += result;
                    numCalc = (numCalc +1);
                    break;
                case 7: //Averages Case
                    attempts += 1;
                    if (numCalc == 0){
                        System.out.println("Error: No calculations yet to average!");
                        break; }
                    System.out.println("Sum of calculations: " + sum );
                    System.out.println("Number of calculations: " + numCalc );
                    double ant = (sum / numCalc) * 100;
                    ant = Math.round(ant);
                    ant = ant/100;
                    System.out.println("Average of calculations: " +  ant );
                    break;
                default: //Case of when a number not in the range [0,7] is entered
                    attempts += 1;
                    System.out.println("Error: Invalid selection!");
                    System.out.println();
                    break;
            }
        }
    }
    public static void printMenu(){ //Prints user menu for choices

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");



    }



}
