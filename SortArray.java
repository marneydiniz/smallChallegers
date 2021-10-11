package br.com.marney.prova.test;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] a = {2, 5, 1, 3, 7, 4, 6, 8};
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
						
		}
		
		System.out.println(Arrays.toString(a));
	}

}
