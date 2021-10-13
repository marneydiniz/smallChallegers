package br.com.marney.prova.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {
		
		// Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
		// Then print the respective minimum and maximum values as a single line of two space-separated long integers.
		
		List<Integer> arr = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
		
		Long sum = (long) 0;
		List<Long> sums = new ArrayList<>();

		int i = 0;	
		
		while(i < arr.size()) {
			
			for (int j = 0; j < arr.size(); j++) {
				
				if (j < arr.size() - 1) {
					sum += arr.get(j) + arr.get(j + 1);
					j++;
				} else {
					sum += arr.get(j);
				}
				
			}
			
			sum -= arr.get(i);
			sums.add(sum);
			sum = (long) 0;
			i++;
			
		}
		
		Comparator<Long> comp = (a, b) -> {
			if(a > b) return 1;
			if(a < b) return -1;
			return 0;
		};
		
		Long min = sums.stream().min(comp).get();
        Long max = sums.stream().max(comp).get();
        System.out.println(min + " " + max);

	}

}
