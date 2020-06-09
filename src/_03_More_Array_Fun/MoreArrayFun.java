package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] strings = {"hi", "hello", "hey", "sup", "howdy"};
		//printStrings(strings );
		//printStringsReverse(strings);
		//printEveryOtherString(strings);
		printRandomStrings(strings);
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStrings (String strings []) {
		for (int x = 0; x<strings.length; x++) {
		System.out.println(strings[x]);
	}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printStringsReverse (String strings []) {
		for (int y = strings.length-1; y>-1; y--) {
		System.out.println(strings[y]);
	}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printEveryOtherString (String strings []) {
		for (int z = 0; z<strings.length; z=z+2) {
		System.out.println(strings[z]);
	}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static Random rand = new Random();
	static ArrayList <String> list = new ArrayList<String>();
	static void printRandomStrings (String strings []) {
		for (int a = 0; a<strings.length; a++) {
			list.add(strings[a]);
		}
		while (!(list.size() ==0) ) {
			System.out.println(list.remove(rand.nextInt(list.size())));
		}
		
	
	}
	
}
