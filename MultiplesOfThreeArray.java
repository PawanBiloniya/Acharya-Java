package swap;

public class MultiplesOfThreeArray {

	public static void main(String[] args) {
		int [] arr= {11,42,23,16,38};
		printmultiple(arr);
		
		// TODO Auto-generated method stub

	}
	public static int printmultiple(int arr[]) {
		int multiples=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]% 3 == 0) {
				multiples++;
				
			}
			
		}
		System.out.println("the multiples of 3 in the array :" +multiples);
		return multiples;
	}
}
