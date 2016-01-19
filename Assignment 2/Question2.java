public class Question2 {
  public static void main (String[] args) {
    int x=14;
    int y=8;
    int radius=5;
    System.out.println("Here is a 20x20 grid with a circle of radius 5 at (14,8).");
    //Calling the method
     DrawMeACircle(x, y, radius);
     
     System.out.println("------------End Program------------");
  }
  public static void DrawMeACircle(int posX, int posY, int radius){
     for (int a=0; a<20; a++){
     for (int b=0; b<20; b++){
       //I gave a name to equation for circle so the condition in if statement can be simplified.
       int theEquation=(((posX-a)*(posX-a)+(posY-b)*(posY-b))-((radius)*(radius)));
       if ((theEquation<5)&&(theEquation>-5))//instead of having theEquation = 0, I relaxed the condition for a better circle. 
        System.out.print("#");
        else
        System.out.print(" ");
      }
    System.out.println();}
  }
  }