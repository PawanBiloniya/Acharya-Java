package swap;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= i*3;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
