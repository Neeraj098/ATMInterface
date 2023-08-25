package com.atm;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args)
	{
		int balance=1000;
		int withdraw=0,deposit=0,num=0;
		int pin=1234,reqpin=0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("HELLO,USER...WELCOME TO ATM MACHINE PLEASE ENTER THE REQ PIN FOR USING THE ATM");
		reqpin=sc.nextInt();
         
		if(pin==reqpin)
		{
			System.out.println("you are eligible for using ATM ....validation done");
		    while(true)
		 {
			System.out.println("welcome to the ATM Machine");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			num = sc.nextInt();
			switch(num)
			{
			case 1:
			       System.out.println("Enter the Amount to Withdraw");
			       withdraw=sc.nextInt();
			       if(balance>=withdraw)
			       {
			    	   balance = balance-withdraw;
			    	   System.out.println("Balance Amount is :"+balance);
			    	   System.out.println("Please collect the money...");
			       }
			       else
			       {
			    	   System.out.println("you don't have enough amount to withdraw");
			       }
			       System.out.println("");
			       break;
			       
			case 2:
				   System.out.println("Enter the Amount to deposit");
				   deposit = sc.nextInt();
				   balance = balance + deposit;
				   System.out.println("Balance amount is :"+balance);
				   System.out.println("Balance has been deposited successfully");
				   System.out.println("");
				   break;
			case 3:
				  System.out.println("Balance of your account is "+balance);
				  System.out.println("");
				  break;
				  
			case 4:
				System.out.println("worng choice....(:");
				System.exit(0);
			}
		}
		}
		    else
		    {
		    	System.out.println("HEYY ,USER....YOU HAVE ENTERED THE WRONG PIN");
		    	System.exit(0);
		    
		    }
	}

}
