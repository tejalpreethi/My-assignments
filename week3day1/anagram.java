package week3day1;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
	int i = text1.length();
	int j = text2.length();
	if(i==j) {
		System.out.println("the length of the given string is equal");
	}
		else {
			System.out.println("the lenght of the given string is not equal");
		}	
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		if(charArray==charArray2) {
			System.out.println("both array have same value");
		}
		else {
			System.out.println("both array does not have same value");
		}
		
		
	}	
}	

