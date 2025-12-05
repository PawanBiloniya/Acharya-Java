package swap;

public class MultiplesOfFiveArray {

		public static void main(String[] args) {
			int [] arr= {10,84,44,15,23,51,36	};
			printmultiple(arr);
			
			// TODO Auto-generated method stub

		}
		public static int printmultiple(int arr[]) {
			int multiples=0;
			for (int i=0; i<arr.length; i++) {
				if (arr[i]% 5 == 0) {
					multiples++;
					
				}
				
			}
			System.out.println("the multiples of 5 in the array :" +multiples);
			return multiples;
		}

	}


