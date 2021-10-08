package br.com.marney.prova.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String palindrome = "";
		
		System.out.print("Enter with a word: ");
		String text = input.next();
		
		for (int i = text.length() - 1; i >= 0; i--) {
			palindrome += text.charAt(i);
		}
		
		if (text.equalsIgnoreCase(palindrome)) {
			System.out.println("It is PALINDROME!!");
		} else {
			System.out.println("It isn't PALINDROME");
		}
		
		input.close();

	}

}
