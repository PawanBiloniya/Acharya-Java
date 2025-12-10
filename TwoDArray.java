import java.util.Scanner;

public class TwoDArray {

	private static int count50to100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr [][]= new int [3][3];
		System.out.println("Enter a number :");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]= sc.nextInt();
				
			}
		}
		
		int count1to50=0;
		int conunt50to100=0;
		int countabove100=0;
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				int num= arr[i][j];
				
				if(num>=1 && num <= 50) {
					count1to50++;
				} else if (num>= 50 && num<= 100) {
					count50to100++;
				} else if (num>100) {
					countabove100++;	
				}
				
			}
		}

		System.out.println("In the above array there are "+ count1to50 + " number between 1 to 50");
		System.out.println("In the above array there are "+ count50to100 + " number between 50 to 100");
		System.out.println("In the above array there are "+ countabove100 + " number above 100");
		
	}

}
