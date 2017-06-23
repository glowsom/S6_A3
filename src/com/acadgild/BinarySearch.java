package com.acadgild;

public class BinarySearch {

	public static void main(String[] args) {
		/* TODO Write a program to search for an element in a one-dimensional
		 * array using Binary Search Algorithm. Display a message stating
		 * whether the element found in an array or not. Also, display
		 * the index position of the element if found.
		 */
		
		//Initializing array
		int[] myArray = {2,3,5,7,8,9,11,13,14};
		//Testing "found" case
		search(3, myArray);
		//Testing "missing" case
		search(10, myArray);
		
	}
	
	//Search returns the index that holds the found element
	static public int search (int x, int[] array){
		/*
		 * Write a program to search for an element in a 
		 * one-dimensional array using Binary Search Algorithm.
		 * Binary search assumes the elements in question are sorted
		 * in an ascending order. The the logic is to check the middle
		 * element to see if it is greater or less than the element to
		 * be found (x). If the middle element is less than that item
		 * becomes the lower bound of the next search. if it is greater,
		 * it becomes the upper bound of the next search. If neither,
		 * then it is equal, so it's found.
		 * This repeats until it's either found or there are no more
		 * elements to compare(which means it's not present).
		 */
		
		//Initializing min and max to array bounds
		int min = 0;
		int max = array.length-1;
		int mid;
		
		/*
		 * Keeps the logic of the code intact + ensures that the last
		 * possible iteration/comparison will happen(min==mid==max)
		 */
		while (min <= max){	
			//Assigns the current middle index to mid.
			mid = min+((max - min)/2); 
			//makes mid the upper bound index if it's value is greater than find 
			if(x < array[mid]) 
				max=mid-1;
			//makes mid the lower bound index if it's value is greater than find
			else if(x > array[mid])
				min=mid+1;
			
			else {	//If neither are true, then find == array[mid]
				System.out.println(x+ " was found at index: " +mid+ " of the array.");
				return mid;
			}
		}
		//If nothing is returned before this point, then x can't be found.
		System.out.println(x+ " could not be found in this array.");
		return -1;
	}

}
