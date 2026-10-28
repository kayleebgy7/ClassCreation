package ClassCreationCalculator;

public class Calculator {
    //equation from the user input that find the sum
    public <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    //finds the difference between two integers
    public <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
    //multiplication of two integers
    public <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    //the division of two integers
    public <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
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
