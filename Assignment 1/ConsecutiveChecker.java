public class ConsecutiveChecker {
  public static void main (String[]args) {
    java.util.Scanner keyboardReader = new java.util.Scanner(System.in);
    
    System.out.println("Enter a 4 digit positive number that is not negative");
    int enterednumber = keyboardReader.nextInt(); 
    int a = enterednumber % 10;
    int b = enterednumber / 10 % 10;
    int c = enterednumber / 100 % 10;
    int d = enterednumber / 1000 % 10;
    
    boolean isOneDigitConsecutive = (b == 0 && c == 0 && d == 0) && (a <= 9 && a >= 1); 
    boolean isTwoDigitConsecutive = (b-a == 1 && c == 0 && d == 0) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1) || (a-b == 1 && c == 0 && d == 0) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1);
    boolean isThreeDigitConsecutive = (c-b == 1 && b-a == 1 && d == 0) && (c <=9 && c>= 1) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1) || (a-b == 1 && b-c == 1 && d == 0)&& (c <=9 && c>= 1) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1); 
    boolean isFourDigitConsecutive = (d-c == 1 && c-b == 1 && b-a == 1) && (d <= 9 && d >= 1) && (c <=9 && c>= 1) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1) || (a-b == 1 && b-c == 1 && c-d == 1) && (d <= 9 && d >= 1) && (c <=9 && c>= 1) && (b <= 9 && b >= 1) && (a <= 9 && a >= 1);
    
    boolean Finale = (isOneDigitConsecutive || isTwoDigitConsecutive || isThreeDigitConsecutive || isFourDigitConsecutive);
    
    System.out.println("Is the number inputted consecutive? " + Finale);
  }
}
    