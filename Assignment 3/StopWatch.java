public class StopWatch {
  
  private long startTime;
  private long stopTime;

  public void start() 
  {          
    startTime = System.nanoTime();
  }

  public void stop() 
  {           
    stopTime = System.nanoTime();
  }

  public long getTimeNano() 
  {      
    return (stopTime-startTime);
  }

  public long getTimeMicro() 
  {     
    return (stopTime-startTime)/1000; 
  }

  public long getTimeMilli() 
  {     
    return (stopTime-startTime)/1000000;
  }

  public long getTimeSeconds() 
  {     
    return (stopTime-startTime)/1000000000;
  }

 public static void main(String[] args) {
   StopWatch watch = new StopWatch();
    watch.start();
    for (int i = 0; i<100;i++){
      System.out.println("I'm going to test how fast it is to print this 100 times");
    }
    watch.stop();
    System.out.println("It took" +watch.getTimeNano()+ "nanosecods to complete that task");
 } 

}