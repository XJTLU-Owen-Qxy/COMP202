public class Question3 {
  public static void main (String[] args) {
    int x=10;
    int y=8;
    int radiusA=5;
    int radiusB=1;
    System.out.println("Here is a 20x20 grid with an ellipse defined by (5,1) radii at (10,8).");
    //Calling the method
     DrawMeAnEllipse(x, y, radiusA, radiusB);
     System.out.println("------------End Program------------");
  }
  public static void DrawMeAnEllipse(int posX, int posY, int radiusA, int radiusB){
     for (int l=0; l<20; l++){
       for (int h=0; h<20; h++){
        int theEquation=(((posX-h)*(posX-h))/((radiusA)*(radiusA))+((posY-l)*(posY-l))/((radiusB)*(radiusB))); 
        //I gave a name to equation for a circle so condition in if statement can be simplified.
        if (theEquation==1)
        System.out.print("#");
        else
        System.out.print(" ");
       }
      System.out.println();
      }
  }
}