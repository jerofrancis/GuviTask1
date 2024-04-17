package com.demo.Task1;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i>0)
		{
			System.out.println("Postive");
		}
		else
		{
			System.out.println("Negative");
		}

	}

}
