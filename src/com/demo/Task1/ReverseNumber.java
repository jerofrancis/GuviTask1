package com.demo.Task1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 876;
		int reversedNum = 0;

		while (num != 0) {
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + reversedNum);
	}

}
