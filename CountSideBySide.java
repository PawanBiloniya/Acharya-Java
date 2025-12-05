package swap;

public class CountSideBySide {

	public static void main(String[] args) {
		int []arr= {14,3,3,14,22,18,28};
		int count=0;
		for (int i= 0; i<arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
			count++;
		}
		// TODO Auto-generated method stub

	if (count == 0) {
		System.out.println("There are no Matching Side by Side");
		
	} else {
		System.out.println("Number of Side by Side: " + count);
	}
}
}
}
