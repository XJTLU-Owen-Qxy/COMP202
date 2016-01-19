import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    String consecutive = "abc" ;
    //check that this prints true
    System.out.println(IsConsecutive(consecutive));
    //check that this prints false
    System.out.println(IsConsecutive("aeg"));
  }
  public static boolean IsConsecutive (String s) {
    Scanner keyboardReader = new Scanner(System.in);
    String j = keyboardReader.next(); 
    s = j.toLowerCase();
    int length = s.length();
    boolean IsConsecutive = false;
    
    if (length == 1) 
      IsConsecutive = true;
    
    
    else if (length >1) {
      for (int i=1; i<length; i++) {
   
                int diff1 = (s.charAt(i)-s.charAt(i-1));
                //int diff2 = (s.charAt(i+2)-s.charAt(i+1));
    
    
                if (((diff1 == 1)|| (diff1 == -1) || (diff1 == 25) || (diff1==-25) ) == false) {
                        IsConsecutive = false;
                        return IsConsecutive;
                }
         }
    
     
      IsConsecutive = true;
     

    }
  
  
  return IsConsecutive;
  }
}