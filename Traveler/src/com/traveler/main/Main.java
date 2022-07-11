package com.traveler.main;

import java.util.Scanner;

import CurerncyCount.Currency;
import MSort.Msort;

public class Main {
	
	public static void main(String[] args) {
		
		Currency currency = new Currency();
		System.out.println("Enter Currency Demonination Size");
		
		
		Scanner scn = new Scanner(System.in);
		int size =scn.nextInt();
		int currncy[] = new int[size];
		
		System.out.println("Enter Currency Demonination Value");
		
		for (int i=0; i<size;i++)
		{
			currncy[i] = scn.nextInt();
		}
		
		System.out.println("Enter Amount");
		
		int amount = scn.nextInt();
		
		Msort sort = new Msort();
		sort.sort(currncy, 0, currncy.length-1);
		
		currency.currencyImplementation(currncy, amount);
				
	}

}
