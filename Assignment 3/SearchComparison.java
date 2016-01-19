import java.util.Arrays;

public class SearchComparison 
{
 public static void main(String[] args)
 {
  StopWatch a= new StopWatch();
  for(int n=10;n<1000000;n=n*2)
  {
  
   a.start();    
   int[] r= ArrayUtilities.generateRandom(n);
   a.stop();
   long timeGenerateArray = a.getTimeMicro();
   
   a.start();
   ArrayUtilities.linearSearch(r,-1);
   a.stop();
   long timeLinearSearch= a.getTimeMicro();
   
   a.start();
   int[] r1= ArrayUtilities.copy(r);
   a.stop();
   long timeDuplicate= a.getTimeMicro();
   
   long timeBubbleSort;
   if(n<163840)
   {
   a.start();
   ArrayUtilities.sort(r);
   a.stop();
   timeBubbleSort = a.getTimeMicro();
   }
   else
   {
   timeBubbleSort= 0;
   }
   
   a.start();
   Arrays.sort(r1);
   a.stop();
   long timeLibrary = a.getTimeMicro();
   
   a.start();
   ArrayUtilities.binarySearch(r,-1);
   a.stop();
   long timeBinarySearch = a.getTimeMicro();
   
   System.out.println(n+","+ timeGenerateArray+","+ timeLinearSearch+","+ timeDuplicate+","+ timeBubbleSort+","+ timeLibrary+","+ timeBinarySearch);
  }
   
 }
}