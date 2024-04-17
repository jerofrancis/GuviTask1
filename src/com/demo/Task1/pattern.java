package com.demo.Task1;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		for(int i=k;i>0;i--)
		{
			for(int j=k;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
