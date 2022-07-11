package com.paymoney.targets;

import java.util.Scanner;

public class Targets {
	public static void main(String args[]) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Transaction Array");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Values");
		
		for (int i = 0; i < size; i++)
		{
		arr[i] = scn.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo = scn.nextInt();
		while (targetNo-- != 0) {
		int flag =0 ;
		long target;
			
		System.out.println("enter the value of target");
		target = scn.nextInt();
		
		long sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
			if (sum >= target) {
			System.out.println("Target achieved after "+(i + 1) + " targets ");
			flag = 1;
			break;
			}
		}
		}
	}
}