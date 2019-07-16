//product array problem
//calcluate the product of the array such that product[i] is equal to the
//product of all elements except array[i]

import java.util.Scanner;

public class ProductArray {
	public static void main(String[] args) {
		//read in array
		System.out.println("Enter the number of elements in the array followed by each element");
		Scanner s = new Scanner(System.in);
		int arraySize = s.nextInt();
		int arr[] = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			arr[i] = s.nextInt();
		}
		
		//create product array
		int prodArr[] = new int[arraySize];

		//calculate product array for each element and print results
		for(int i = 0; i < arraySize; i++) {
			int product = 1;
			for(int j = 0; j < arraySize; j++) {
				if(j != i) {
					product *= arr[j];
				}
			}
			prodArr[i] = product;
		}

		//print result
		for(int i : prodArr) {
			System.out.println(i);
		}
	}
}
