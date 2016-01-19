public class MathTrick {
  public static void main (String[]args) {
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    
    System.out.print("Abracadabra!");
    System.out.println("Enter a 3 digit number with decreasing digits");
    int inputnumber = keyboardReader.nextInt();  
    
    //
    
    int ones = inputnumber % 10;
    int tens = inputnumber / 10 % 10;
    int hundreds = inputnumber / 100 % 10;
    
    int reversednumber = ones * 100 + tens * 10 + hundreds;
    
    System.out.println("Reversed number: " + reversednumber);
    
    // Here I am reversing the original number
    
    int subtractednumber = (inputnumber - reversednumber);
    
    System.out.println("The difference is: " + subtractednumber);
    
    // Here I am subtracting the reversed number from the original number
    
    int a = subtractednumber % 10;
    int b = subtractednumber / 10 % 10;
    int c = subtractednumber / 100 % 10;
    int reversednewnumber = a * 100 + b * 10 + c;
    
    System.out.println("Reversed new number is: " + reversednewnumber);
    
    // Here I am reversing the subtracted number
    
    int finale = (reversednewnumber + subtractednumber);
     
    System.out.println("Total sum is: " + finale);
    
    // Here I am adding the subtracted number with the newly reversed number
   
  }
}
    
    
