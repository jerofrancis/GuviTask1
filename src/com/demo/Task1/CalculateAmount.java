package com.demo.Task1;

import java.util.Scanner;

public class CalculateAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.print("Please Enter the purchase amount:");
		int purchaseAmount=sc.nextInt();
        int Amount = 0;
		if(purchaseAmount<500)
		{
			Amount=purchaseAmount;
		}
		else if(purchaseAmount>=500 && purchaseAmount<=1000)
		{
			Amount=purchaseAmount-((purchaseAmount/100)*10);
		}
		else if(purchaseAmount>1000)
		{
			Amount=purchaseAmount-((purchaseAmount/100)*20);
		}
		
		System.out.println("Payable Amount is "+ Amount);
		
		
	}

}
