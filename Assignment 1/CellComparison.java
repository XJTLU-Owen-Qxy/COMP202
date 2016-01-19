

public class CellComparison{
  public static void main(String[] args){
    System.out.println("How many months will you use the phone?");
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    int month = keyboardReader.nextInt();
    System.out.println("How many minutes do you plan to talk per month?");
    int minutes = keyboardReader.nextInt();
    
    double AplanPrice = 50 * month + .10 * minutes;
    double BplanPrice = 500 + 50 * month + .05 * minutes;
    
    System.out.println("Under A Plan: " + AplanPrice);
    System.out.println("Under B Plan: " + BplanPrice);
  }
}
