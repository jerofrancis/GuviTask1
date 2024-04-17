package com.demo.Task1;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 3 number:");
		Scanner sc=new Scanner(System.in);
		int[] array = new int[3];  
		for(int i=0;i<3;i++)
		{
			array[i]=sc.nextInt();	
		}
		System.out.print("the smallest number is ");
		for(int i=0;i<array.length;i++)
		{
			int min = array[0];
			if(min>array[i])
			{
			System.out.println(array[i]);
			}
		}

	}

}
