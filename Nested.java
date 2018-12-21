/*import java.util.*;

class Account

{
  
    int accid,balance;
  
    String accname;
   
    Scanner sc=new Scanner(System.in);
  
    Account()
 
    {
     
       System.out.println(" Enter account id");
    
       accid=sc.nextInt();
      
       System.out.println(" Enter balance");
      
       balance=sc.nextInt();
       
       System.out.println(" Enter Account name");
       
       accname=sc.next();
 
    }    
  
    class Locker
   
    {
   
       void display()
        
       {
         
          System.out.println("Account id="+accid);
  
          System.out.println("Balance="+balance);
         
          System.out.println("Account name="+accname);
     
       }
  
    }

}   
   
class Nested
  
{
     
   public static void main(String args[])
  
   {
       
       Account a=new Account();
    
       Account.Locker l=a.new Locker();
       
       l.display();
     
   }
  
}*/     
 
/* abstract class AnnonymousInner
 
  {
      
      abstract void display();
       
  
  }
   
 class Nested
 
 {
    
     public static void main(String args[])
 
     {
           
         AnnonymousInner i=new AnnonymousInner()  
  
       {
                
             void display()
      
             {
             
                     int id=20;int balance=3000;
    
                     String accname="xyz";
   
                     System.out.println("Account id="+id);
  
                     System.out.println("Balance="+balance);
  
                     System.out.println("account name="+accname);
  
             }
        
          };
   
          i.display();
  
 
       }
    
 }*/   
class Account
 
{
         
      int id=30;int balance=1000;
  
      String aname="xyz";
  
      void display()
      
      {
      
           class Locker
  
           {
             
             void display1()
    
             {
         
                  System.out.println("Account id="+id);
   
                  System.out.println("Balance="+balance);
 
                  System.out.println("account name="+aname);
  
             }
         
           }
          
           Locker l=new Locker();
    
           l.display1();
      
       }
   
}
   
class Nested
 
{
       
     public static void main(String args[])
   
     {
           
            Account a=new Account();
   
            a.display();
   
      }
     
}    

//output:
//1. Member inner class:
/*C:\Users\Tejal\Desktop>java Nested
 Enter account id
100
 Enter balance
5000
 Enter Account name
abc
Account id=100
Balance=5000
Account name=abc*/

//Annonymous inner class:
/*C:\Users\Tejal\Desktop>javac Nested.java

C:\Users\Tejal\Desktop>java Nested
Account id=20
Balance=3000
account name=xyz*/

//Local iiner class
C:\Users\Tejal\Desktop>javac Nested.java

C:\Users\Tejal\Desktop>java Nested
Account id=30
Balance=1000
account name=xyz
                   
                                             
