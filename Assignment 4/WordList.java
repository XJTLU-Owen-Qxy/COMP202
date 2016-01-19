import java.util.*;
import java.io.*;

public class WordList {
  
  private static Random r = new Random();
  private ArrayList<String> words = null;
  
  public static void main(String[] args) 
  {
    try
    {
      WordList w = new WordList("MaleNames.txt");
    System.out.println(w.getRandomWord());
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    
  }
  public WordList(String filename) throws IOException
  {
    words = new ArrayList<String>();
    
    BufferedReader br = new BufferedReader(new FileReader(filename));
      
   
      String line = br.readLine();
    
    
       while (line != null)
       { //System.out.println(line);
        words.add(line);
        line = br.readLine();
       }
      br.close();
    }
  
  
  public String getRandomWord() {
    String a = words.get(r.nextInt(words.size()));
    return a;
  }
}

  
 
  
