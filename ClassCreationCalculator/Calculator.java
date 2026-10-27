package ClassCreationCalculator;

public class Calculator {
    //equation from the user input that find the sum
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    //finds the difference between two integers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    //multiplication of two integers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //the division of two integers
    public int divide(int num1, int num2) {
        return num1/num2;
    }

    //overload method for doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    //subtracts two doubles 
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    //multiplies two doubles
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    //divides the doubles
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
       
   
}
