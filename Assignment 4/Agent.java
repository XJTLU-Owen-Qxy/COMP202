import java.util.*;
import java.util.GregorianCalendar;
import java.io.*;
import java.util.Random;


public class Agent 
{
  private String name;
  private String homeTown;
  private String currentTown;
  private String major;
  private String gender;
  private static Random r = new Random();
  private GregorianCalendar birthday;

    
  //getter
  public String getName()
  { 
    return this.name;
  }
  public String getHomeTown()
  { 
    return this.homeTown;
  }
  public String getMajor()
  {
    return this.major;
  }
  public String getCurrentTown()
  { 
    return this.currentTown;
  }
  public String getGender()
  { 
    return this.gender;
  }
  public String getBirthday()
  {
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String month = months[birthday.get(GregorianCalendar.MONTH)];
    String day = "" + birthday.get(GregorianCalendar.DAY_OF_MONTH);
    String year = "" + birthday.get(GregorianCalendar.YEAR);
    return day + "th of " + month + ", " + year;
  }
    
public static Agent generateAgent() 
  {
    Agent a = new Agent();
    try
    {
    WordList cities = new WordList("Cities.tx");
    a.homeTown = cities.getRandomWord();
    a.currentTown = cities.getRandomWord();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    a.generateBirthday();
    a.getBirthday();
      try
      {
   a.gender = a.generateGender();
   if (a.gender.equals("female"))
   {
    WordList fnames = new WordList("FemaleNames.txt");
    a.name = fnames.getRandomWord();
   }
   else
   {
     WordList mnames = new WordList("MaleNames.txt");
     a.name = mnames.getRandomWord();
   }
      }
      catch(Exception e)
      {
        System.out.println(e);
    }
      try
      {
   WordList majors = new WordList("Majors.txt");
   a.major = majors.getRandomWord();
      }
      catch(Exception e)
      {
        System.out.println(e);
    }
    return a;
  }
  
  
  
  //constructor
  private Agent()
  {}
  
   public void generateBirthday()
   {
    GregorianCalendar calendar = new GregorianCalendar();
    int year = r.nextInt(2000-1910+1)+1910;
    int dayOfYear = r.nextInt(calendar.getActualMaximum(GregorianCalendar.DAY_OF_MONTH))+1;
    int month =r.nextInt(12-1+1)+1;
    calendar.set(GregorianCalendar.MONTH, month);
    calendar.set(GregorianCalendar.YEAR, year);
    calendar.set(GregorianCalendar.DAY_OF_MONTH, dayOfYear);
    
    this.birthday = calendar;
    
   }
   
  public String generateGender()
  {
    String gender;
    boolean x = (Math.random())>0.5;
    if(x)
    {
      gender = "male";
    }
    else
    {
      gender = "female";
    }
     return gender;
  }
      
  //saymethods
  public void sayName()
  {
    System.out.println(this.name + " says: Hello my dear! My name is " + this.name +'.');
  }
  public void sayHomeTown()
  {
    System.out.println(this.name + " says: I am from " + this.homeTown + '.');
  }
  public void sayCurrentTown()
  {
    System.out.println(this.name + " says: I live in " + this.currentTown + '.');
  }
  public void sayMajor()
  {
   System.out.println(this.name + " says: My major is " + this.major +'.');
  }
  public void sayGender()
  {
   System.out.println(this.name + " says: I am a " + this.gender +'.');
  }
  public void howOldAreYou()
  {
    System.out.println(this.name + " says: I am " + ((GregorianCalendar.getInstance().get(GregorianCalendar.YEAR)-(this.birthday.get(GregorianCalendar.YEAR))) + " years old."));
  }
  
  
  public static void main(String[] args) 
  { 
    Agent a = Agent.generateAgent();
    a.whoAreYou();
    //testing birthday
    //System.out.println(a.getBirthday());
    
  }
  
 public void whoAreYou() 
 {
   
    this.sayName();
    this.sayMajor();
    this.howOldAreYou();
    this.sayCurrentTown();
    this.sayHomeTown();
    //testing gender
    //this.sayGender(); 
   //System.out.println(this.name + " says: My birthday is " );
 }
  
 
 
 
 
 
 
  
  private String beginningSentence()
  {
    return this.name + " says: ";
  }
  public void sayHello()
  {
    System.out.println(beginningSentence() + "Hello, my name is " + this.name);
  }
  public void sayNotSoGood(String name)
  {
    System.out.println(beginningSentence() + "Hello " + name + ". I am " + this.name + ", I am not feeling so good.");
  }
  public void why(Agent a)
  {
    System.out.println(beginningSentence() + "Why are you not feeling so good?");
  }
  public void howAreYou(String name)
  {
    System.out.println(beginningSentence() + "How are you " + name + "?");
  }
  public void fineWhereFrom(Agent a)
  {
    System.out.println(beginningSentence() + "I am fine. Thank you " + a.getName() + '.'+ " Where are you from?"); 
  }
  public void fromCityBorn(Agent b)
  {
    System.out.println(beginningSentence() + "I am from " + b.getHomeTown());
  }
  
  public void dislike(Agent a)
  {
    System.out.println(beginningSentence() + "I don't like people from " + this.getHomeTown() + " because I am from " + a.getHomeTown() + '.');
  }
  public void dontCare(Agent a)
  {
    System.out.println(beginningSentence() + "Well, I don't care because I am from " + a.getHomeTown());
  }
  public void canadian(Agent b)
{
  System.out.println(beginningSentence() + "Well, I am sorry I am Canadian.");
}
  public void rude(Agent b)
{
  System.out.println(beginningSentence() + "No one in my major " + b.getMajor() + " is this rude.");
}
  public void left(Agent a)
  {
    System.out.println(beginningSentence() + "I just left my home town" + a.getHomeTown());
  }
  public void metoo(Agent b)
  {
    System.out.println(beginningSentence() + "Well, me too. I was from " + b.getHomeTown() + " and now I am in " + this.getHomeTown());
  }
  public void haveToGo(Agent a)
  {
    System.out.println(beginningSentence() + "Sorry I have to go.");
  }
  public void soFascinating(Agent a)
  {
    System.out.println(beginningSentence() + "This is so fascinating!");
  }
  public void loveGroove(Agent b)
  {
    System.out.println(beginningSentence() + "I love you groove.");
  }
  public void dontKnowName(Agent a)
  {
    System.out.println(beginningSentence() + "Well, thank you, but I don't know your name.");
  }
  public void myName(Agent b)
  {
    System.out.println(beginningSentence() + "My name is " + b.getName() + '.');
  }
  public void haveToGo2(Agent a)
  {
    System.out.println(beginningSentence() + "Sorry " + this.getName() + " I have to go.");
  }
  public void cantSpeak(Agent a)
  {
    System.out.println(beginningSentence() + "Sorry, I can't speak with people from " + this.getHomeTown() + '.');
  }
                        
      
} 
