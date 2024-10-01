/*
 * This program defines a simple calculator that can perform
 * basic arithmetic operations such as addition, subtraction,
 * multiplication, division, and modulo (remainder).
 * 
 * The program allows the user to create a Calculator object
 * and use its methods to perform calculations. The main method
 * demonstrates how to use the Calculator class and prints out
 * the result of calling the add() method with 5 and 7 as parameters.
 */

 public class Calculator {
  
    //Conductor
    public Calculator(){
  
    }
  
    //Method to add two numbers 
    public int add(int a, int b){
      return a + b;
    }
  
    // Method to subtract two numbers
    public int subtract(int a, int b) {
      return a - b; 
    }
  
    // Method to multiply two numbers
    public int multiply(int a, int b) {
      return a * b; 
    }
    
    // Method to divide two numbers
    public int divide(int a, int b) {
      if (b == 0) {
        System.out.println("Error: Division by zero is not allowed.");
        return 0; // Returning 0 to handle divide by zero scenario
      } else {
        return a / b; // Return the result of dividing a by b
      }
    }
  
    // Method to find the remainder of two numbers
    public int modulo(int a, int b) {
      if (b == 0) {
        System.out.println("Error: Modulo by zero is not allowed.");
        return 0; 
      } else {
        return a % b;
      }
    }
  
  
  
  
    // Main method - the entry point of the program
    public static void main(String[] args) { 
  
      // Create an instance of the Calculator
      Calculator calc = new Calculator();
  
      //Examples of the methods
      int sum = calc.add(5, 7);  
      int difference = calc.subtract(45, 11);  
      int product = calc.multiply(10, 5);
      int quotient = calc.divide(10, 5);
      int remainder = calc.modulo(10, 3);
  
  
    // Output the results
      System.out.println("The sum is: " + sum);  
      System.out.println("The difference is: " + difference);
      System.out.println("The product is: " + product);
      System.out.println("The quotient is: " + quotient);
      System.out.println("The remainder is: " + remainder);
  
    }
  
  }