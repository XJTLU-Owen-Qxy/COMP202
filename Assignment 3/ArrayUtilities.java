import java.util.Arrays;
import java.util.Random;
  
  public class ArrayUtilities {
    public static boolean linearSearch(int[] array, int target)
  {
    for (int i=0; i<array.length; i++) 
    {
      if (array[i] == target)
      { return true;
      }
      
    }
  return false;
  }
  
  public static boolean binarySearch(int[] array, int target)
  {
    //type name = assign;
      
    int left = 0;     
    int right = array.length - 1;
    int middle = (left + right)/2;
   while (left< right)
    {
    if (array[middle] == target)
    { return true;
    }
    else if (array[middle] <= target)
    { left = middle + 1;
      middle = (left+right)/2;
      }
    else if (array[middle] >= target)
    { right = middle - 1;
      middle = (left + right)/2;
    }
    }
    return false;
  }
  
  public static int[] copy(int[] array)
  {
    int[] newarray = new int[array.length];
    for (int i=0; i<array.length; i++)
    { 
      newarray[i] = array[i];
    }
    return newarray;
  }
  
  public static void sort(int[] array)
  {
    for (int i=0; i<array.length - 1; i++)
    {
      for(int j=i+1; j<array.length - 1; j++)
      {
        if (array[i]>array[j]) 
        { int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
  public static int[] generateRandom(int n)
  {
    int[] array = new int[n];
    Random r = new Random(1);
    
    for (int i = 0; i<n; i++)
    {array[i] = r.nextInt(Integer.MAX_VALUE);
      
    }
    return array; 
  }
  public static void main(String[] args) {
    ArrayUtilities utility = new ArrayUtilities();
  
   
 } 
}
