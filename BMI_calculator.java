import java.util.*;
public class BMI_calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("--------------------");
    System.out.println("BMI CALCULATOR");
    System.out.println("---------------------");
    System.out.print("Enter the wait of a person in KG's:");
    float weight=sc.nextFloat();
    System.out.println(weight+" KG's");
    System.out.print("Enter the  height in feet:");
    float feet=sc.nextFloat();
    float height=feet*0.3040f;
    System.out.println(height+" meters");
    float BMI=(weight)/(height*height);
     
    System.out.println("Body Mass Index value of a person is:"+BMI);
    if(BMI<18.5)
    {
        System.out.println("person is 'UNDERWEIGHT'");
    }
   else if(BMI>=18.5 && BMI<25)
   {
    System.out.println("Person is 'NORMAL WEIGHT");
   }
   else if(BMI>=2.5 && BMI<30)
   {
    System.out.println("Person is 'OVER WEIGHT'");
   }
System.out.println("-------THANK YOU-----------");
  }
}
