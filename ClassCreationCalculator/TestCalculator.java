package ClassCreationCalculator;
import java.util.Scanner;
public class TestCalculator {
    public static void main(String[] args) {
   
    System.out.println("Welcome to Calculator!");
    Calculator cal = new Calculator();
//     int valueInt = 15;
//     int valueInt2 = 3;

//     double valueDouble = 15.0;
//     double valueDouble2 = 3.0;
   
//     System.out.println(valueInt + "+" + valueInt2 + "=" + cal.add(valueInt,valueInt2));

//     System.out.println(valueInt + "-" + valueInt2 + "=" + cal.subtract(valueInt,valueInt2));

//     System.out.println(valueInt + "*" + valueInt2 + "=" + cal.multiply(valueInt,valueInt2));

//     System.out.println(valueInt + "/" + valueInt2 + "=" + cal.divide(valueInt, valueInt2));

//     System.out.println(valueDouble + "+" + valueDouble2 + "=" + cal.add(valueDouble, valueDouble2));

//     System.out.println(valueDouble + "-" + valueDouble2 + "=" + cal.subtract(valueDouble, valueDouble2));

//     System.out.println(valueDouble + "*" + valueDouble2 + "=" + cal.multiply(valueDouble, valueDouble2));

//     System.out.println(valueDouble + "/" + valueDouble2 + "=" + cal.divide(valueDouble, valueDouble2));


//     Calculator calculator = new Calculator();
//        System.out.println(num1 + "+" + num2 + "=" + calculator.add(1, 2));
//        System.out.println(calculator.subtract(7, 2));
//        System.out.println(calculator.multiply(9, 2));
//        System.out.println(calculator.divide(18, 2));

//        System.out.println(calculator.add(16.0, 4.0));
//        System.out.println(calculator.subtract(12.0, 4.0));
//        System.out.println(calculator.multiply(3.0, 4.0));
//        System.out.println(calculator.divide(90.0, 10.0));

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the following the this format (data type operandSign num1 num2): ");
    String dataType = input.next();
    String operator = input.next();      
       
 if (dataType.equals("double"))
    {
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double result;
//deals with addition
 if (operator.equals("+"))
        result = cal.add(num1,num2);
//for subtraction by comparing the user entered operator
 else if(operator.equals("-"))
        result = cal.subtract(num1,num2);
//checks the operator for multiplication
 else if(operator.equals("*"))
        result = cal.multiply(num1,num2);
//checks for divison
 else if(operator.equals("/"))
        result = cal.divide(num1,num2);
//checks if the user inputed invalid data
 else {
        System.err.println("Invalid operator.");
        return;
    }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
 }
 // code for integers
 else if (dataType.equals("integer")){
       //declared objects from user input
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        //result stored in this object
        double result;
//used if the operator sign is for addition
 if (operator.equals("+"))
        result = cal.add(num1,num2);
//used if subtraction
 else if(operator.equals("-"))
        result = cal.subtract(num1,num2);
//used if multiplication
 else if(operator.equals("*"))
        result = cal.multiply(num1,num2);
//for division
 else if (operator.equals("/"))
        result = cal.divide(num1,num2);
//checks for wrong user input
 else {
        System.err.println("Invalid operator.");
        return;
    }
//formating for answers to be printed out as a full equation
 System.out.println(num1 + " "+ operator + " " + num2 + " = " + result);
 }
 // checks for incorrect data type
 else {
 System.err.println("Data type incompatible - exiting program.");
}
//closes the scanner object
input.close();

    }
   
}
