package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] many = {"other thing", "a few things", "thing", "tons of things", "too many things"};
		//2. print the third element in the array
		System.out.println(many[2]);
		//3. set the third element to a different value
		many[3] = "things";
		//4. print the third element again
		System.out.println(many[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(String blahblahblah : many) {
			System.out.println(blahblahblah);
		}
		
		//6. make an array of 50 integers
		int numbahs[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		int f = 0;
		int big = -1;
		int small = 100;
		Random r = new Random();
		for(int i = 0;i < 50; i++) {
			f = r.nextInt(101);
			numbahs[i] = f;
			if(f < small) {
				small = f;
			}
			if(f > big) {
				big = f;
			}
			
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for(int g = 0;g < 50; g++) {
			System.out.println(numbahs[g]);
		}
		//10. print the largest number in the array.
		System.out.println(big);
	}
}
