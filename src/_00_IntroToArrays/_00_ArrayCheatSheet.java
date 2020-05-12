package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array = { "Hi", "hello", "hey", "howdy", "sup" };
		// 2. print the third element in the array
		System.out.println(array[3]);
		// 3. set the third element to a different value
		array[3] = "yo";
		// 4. print the third element again
		System.out.println(array[3]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int x = 0; x < array.length; x++) {
			array[x] = "Jake";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
		// 7. make an array of 50 integers
		int[] array2 = new int[50];
		Random rand = new Random();
		// 8. use a for loop to make every value of the integer array a random number
		for (int y = 0; y < 50; y++) {
			array2[y] = rand.nextInt(50);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = array2[0];
		for (int z = 0; z < 50; z++) {
			if (array2[z] < smallest) {
				smallest = array2[z];
			}

		}
		System.out.println("" + smallest);
		// 10 print the entire array to see if step 8 was correct
		for (int a = 0; a < 50; a++) {
			System.out.println(array2[a]);
		}
		// 11. print the largest number in the array.
		int largest = array2[0];
		for (int b = 0; b < 50; b++) {
			if (array2[b] > largest) {
				largest = array2[b];
			}

		}
		System.out.println(largest);
		// 12. print only the last element in the array
		System.out.println("" + array2[array2.length - 1]);
	}
}
