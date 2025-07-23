import java.util.*;
 class AcessBank
{
    private int Balance;

    public Scanner sc = new Scanner(System.in);

    public int getBalance()
    {
        System.out.println("Your Current Balance is :"+Balance); 
        
        return this.Balance;
    }

    public void setBalance(int Balance)
    {
System.out.println("Enter The Amount to be Inserted :");
Balance=sc.nextInt();
      this.Balance=Balance;
      System.out.println("Amount Inserted SucessFully");
     
    }
    public AcessBank(int Balance)
    {
this.Balance=Balance;
    }
    public void Deposite()
    {
            System.out.println("Enter the balance to deposite in Ac: ");
         int Depos=sc.nextInt();
        if(Depos>0)
        {

    
        Balance=Balance+Depos;
        System.out.println("The current Balance is :"+Balance);
        }
        else{
            System.out.println("invalid Amount");
        }
    }
    public void Withdraw()
    {
        System.out.println("Enter the Amount to Withdraw from Ac: ");
           int With=sc.nextInt();
        if(Balance<With){
System.out.println("Cannot Withdraw");
System.out.println("Your Current Balance is :"+Balance);
        }
        else{

     
        Balance=Balance-With;
        System.out.println("current Balance is : "+Balance);
        }
        
    }
    }
    
    public class Bank
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int ch;
        AcessBank b1 = new AcessBank(100);
        do{
System.out.println("----------------Enter the operation to be Performed----------------");
System.out.println("\n1.Enter Amount\n2.get Balance\n3.Deposite\n4.Withdraw");
System.out.println("Enter your choice");
ch=sc.nextInt();

switch(ch)
{
case 1:  b1.setBalance(100);break;
case 2: b1.getBalance();break;
case 3: b1.Deposite();break;
case 4: b1.Withdraw();break;
case 5:System.out.println("Exit");break;
default:System.out.println("Invalid Choice");
System.out.println("please Enter Valid Choice");
break;
}

  }
  while(ch!=5);
    }
}

