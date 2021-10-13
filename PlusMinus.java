package br.com.marney.prova.test;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		// Print the ratios of positive, negative and zero values in the array.
		// Each value should be printed on a separate line with digits after the decimal.
		// The function should not return a value.
		
		List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);
		
		double n = arr.size();
		
		double pos = 0;
		double neg = 0;
		double zer = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr.get(i) > 0) {
				pos++;
			} else if (arr.get(i) < 0) {
				neg++;
			} else {
				zer++;
			}
		}
		
		System.out.println(pos / n);
		System.out.println(neg / n);
		System.out.println(zer / n);

	}

}
