package swap;

public class BubbleSort {

	public static void main(String[] args) {
		int []arr= {4,8,3,9,5,7,6,2};
		int temp;
		
		for (int i =0; i<arr.length-1; i++) {
			for (int j = 0; j<arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		// TODO Auto-generated method stub
		for(int ele:arr) {
			System.out.println(ele+" ");
		}
	}

}
