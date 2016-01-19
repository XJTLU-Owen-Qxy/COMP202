import java.util.Random;
import java.io.IOException;

public class DiscussionDirector{
    static Random r = new Random();
    private Agent a;
    private Agent b;

  public void discuss(Agent a, Agent b) {
    int pro = r.nextInt(1000);
    a.sayHello();
    if (pro < 500) {
      b.sayNotSoGood(a.getName());
      pro = r.nextInt(1000);
      if (pro >= 200) {
        a.why(b);
        b.left(a);
        a.metoo(b);
        pro = r.nextInt(1000);
        if (pro < 300) {
          b.cantSpeak(a);
        } else {
          b.soFascinating(a);
        }
      } else {
        a.dontCare(b);
        pro = r.nextInt(1000);
        if (pro < 100) {
          b.canadian(a);
        } else {
          b.rude(a);
        }
        a.haveToGo(b);
      }
    } else {
      b.howAreYou(a.getName());
      a.fineWhereFrom(b);
      b.fromCityBorn(a);
      a.dislike(b);
      pro = r.nextInt(1000);
      if (pro < 300) {
        b.soFascinating(a);
      } else {
        b.loveGroove(a);
        a.dontKnowName(b);
        b.myName(a);
        a.haveToGo2(b);
      }
    }
  }
  public static void main(String[] args) throws IOException 
  {
   Agent a = Agent.generateAgent();
    Agent b = Agent.generateAgent();
    DiscussionDirector d = new DiscussionDirector();
    d.discuss(a,b);
  }
    
}