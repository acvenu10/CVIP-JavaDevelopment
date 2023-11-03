import java.util.*;
    class records
    {
         int balance;
     Scanner sc=new Scanner(System.in);
    
   public void display2()
   {
     System.out.print("Enter Register Number:");
     int n=sc.nextInt();
     if(n==16)
     {
        System.out.println("Name : AC.venumadhav");
        int total=46000;
        System.out.println("Total fee is"+total);
        System.out.println("Enter amount to pay :");
        int amount=sc.nextInt();
        int balance=total-amount;
        System.out.println("Now your balance is:"+balance);
        System.out.println("Payment is success");
        System.out.println("-----Thank you-------");
   }
   else
   {
    System.out.println("please check you register number:");
   }
}
   public void display1()
    {    

     System.out.print("Enter Register Number:");
     int n=sc.nextInt();
     if(n==16)
     {
        System.out.println("Name : AC.venumadhav");
        System.out.println("Fees detatils");
        System.out.println("-------------------------");
        long sem=35000,library=3000,lab=5000,exam=3000;
         System.out.println("semister fee :"+sem);
         System.out.println("library is :"+library);
         System.out.println("Lab fee : "+lab);
         System.out.println("exam fee : "+exam);
         int total;
         System.out.println("Total fee:"+(sem+library+lab+exam));
     }
     else{
           System.out.println("please check your register number");
     }
}
public void display3()
{

     System.out.print("Enter Register Number:");
     int n=sc.nextInt();
     if(n==16)
     {
        System.out.println("Name : AC.venumadhav");
        System.out.println("department is : CSE");
        System.out.println("3rd year");
        System.out.println("section:F");
}
    }
    
}  
    
class FeeManagementSystem
{
    public static void main(String args[])
    {
        records fd=new records();
        Scanner sc=new Scanner(System.in);
     System.out.println("------------------------------------------------------------------");   
     System.out.println("College Name : BHARATH INSTITUE OF HIGHER EDUCATION AND RESEARCH ");
     System.out.println("-------------------------------------------------------------------");
     System.out.println("----------------------WELCOME OUR COLLEGE-----------------");
     while(true){
    System.out.println("1.VIEW FEE DETAILS \n 2.PAY FEE \n 3.VIEW STUDENT DETAILS \n 5.EXIT");
    System.out.println("Select Option Above");
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1: 
            fd.display1();
           break;
        case 2:
            fd.display2();
            break;
        case 3:
            fd.display3();   
             break;
     case 5:
                  
             System.exit(0);       
             break;
      default:
         System.out.println("invaliod input try again");       

            
    }
}
    
    }
}