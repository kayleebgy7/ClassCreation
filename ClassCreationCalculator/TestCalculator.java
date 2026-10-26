package ClassCreationCalculator;
import java.util.Scanner;
public class TestCalculator {
    public static void main(String[] args) {
   
    System.out.println("Welcome to Calculator!");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the following the this format (data type operandSign num1 num2): ");
    String dataType = input.nextLine();
    String operator = input.nextLine();
    input.close();
    Calculator calculator = new Calculator();
    // Code block that handles doubles

       
 if (dataType.equals("double")) 
    {
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double result;

 if (operator.equals(" + "))
        result = calculator.addIntegers(num1,num2);

 else if(operator.equals(" - "))
        result = calculator.subtractInt(num1,num2);

 else if(operator.equals(" * "))
        result = calculator.multiply(num1,num2);

 else if(operator.equals(" / "))
        result = calculator.divideInt(num1,num2);

 else {
        System.err.println("Invalid operator.");
        return;
    }
        System.out.println(num1 + operator + num2 + "=" + result);
 }
 // Code block that deals with integers
 else if (dataType.equals("integer")){
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result;

 if (operator.equals(" + "))
        result = calculator.addIntegers(num1,num2);

 else if(operator.equals(" - "))
        result = calculator.subtractInt(num1,num2);

 else if(operator.equals(" * "))
        result = calculator.multiply(num1,num2);

 else if (operator.equals(" / "))
        result = calculator.divideInt(num1,num2);

 else {
        System.err.println("Invalid operator.");
        return;
    }
 System.out.println(num1 + operator + num2 + "=" + result);
 }
 // Code block to deal with a non - valid data type input
 else {
 System.err.println("Data type incompatible - exiting program.");
}


//     Calculator cal = new Calculator();
//     System.out.println(num1 + "+" + num2 + "=" + cal.addIntegers(num1,num2));

//     System.out.println(num1 + "-" + num2 + "=" + cal.subtractInt(num1,num2));

//     System.out.println(num1 + "*" + num2 + "=" + cal.multiply(num1,num2));

//     System.out.println(num1 + "/" + num2 + "=" + cal.divideInt(num1, num2));

//     System.out.println(num1 + "+" + num2 + "=" + cal.addIntegers(num1, num2));

//     System.out.println(num1 + "-" + num2 + "=" + cal.subtractInt(num1, num2));

//     System.out.println(num1 + "*" + num2 + "=" + cal.multiply(num1, num2));

//     System.out.println(num1 + "/" + num2 + "=" + cal.divideInt(num1, num2));
    }

}
