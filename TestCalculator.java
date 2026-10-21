package ClassCreationCalculator;
import java.util.Scanner;
public class TestCalculator {
    public static void main(String[] args) {
    int num1 = 5;
    int num2 = 7;


    double num3 = 16.0;
    double num4 = 8.0;
    System.out.println("Welcome to Calculator!");
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the following the this format (data type operandSign num1 num2): ");
    String dataType = input.nextLine();
    String operator = input.nextLine();
    String value1 = input.nextLine();
    String value2 = input.nextLine();
    input.close();
    Calculator calculator = new Calculator();
    // Code block that handles doubles

 if (dataType.equals(" double ")) 
    {
        value1 = input.nextDouble();
        value2 = input.nextDouble();
        double result;

 if (operator . equals ( " + " ) )
 result = calculator.addIntegers(value1,value2);

 else if (operator.equals (" - "))
 result = calculator.subtractInt(value1 ,value2);

 else if (operator.equals(" * "))
 result = calculator.multiply(value1,value2);

 else if (operator.equals(" / "))
 result = calculator.divideInt(value1,value2);

 else {
 System.err.println(" Invalid operator . ");
 return;
 }
 System.out.println(result);
 }
 // Code block that deals with integers
 else if (dataType.equals(" integer " )){

 value1 = input.nextInt();
 value2 = input.nextInt();
 int result;

 if (operator.equals( " + " ))
 result = calculator.addIntegers(value1,value2);

 else if (operator.equals(" -"))
 result = calculator . subtractInt ( value1 , value2 ) ;

 else if (operator.equals(" * "))
 result = calculator . multiply ( value1 , value2 ) ;
 else if (operator.equals(" / "))
 result = calculator.divideInt(value1,value2);
 else {
 System.err.println(" Invalid operator . ");
 return;
 }
 System.out.println(result);
 }
 // Code block to deal with a non - valid data type input
 else {
 System. err.println(" Data type incompatible - exiting program . ");
}


    Calculator cal = new Calculator();
    System.out.println(num1 + "+" + num2 + "=" + cal.addIntegers(num1, num2));




    System.out.println(num1 + "-" + num2 + "=" + cal.subtractInt(num1, num2));




    System.out.println(num1 + "*" + num2 + "=" + cal.multiply(num1, num2));




    System.out.println(num1 + "/" + num2 + "=" + cal.divideInt(num1, num2));




    System.out.println(num3 + "+" + num4 + "=" + cal.addIntegers(num3, num4));




    System.out.println(num3 + "-" + num4 + "=" + cal.subtractInt(num3, num4));




    System.out.println(num3 + "*" + num4 + "=" + cal.multiply(num3, num4));




    System.out.println(num3 + "/" + num4 + "=" + cal.divideInt(num3, num4));
    }




}
