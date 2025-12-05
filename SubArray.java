package swap;

import java.util.Scanner;

public class SubArray{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter start index");

        int sIndex = sc.nextInt();

        System.out.println("Enter end index");

        int eIndex = sc.nextInt();

        SubArray.subArray(arr, sIndex, eIndex);

    }

    public static int[] subArray(int myarr[], int sindex, int eindex) {

        int size = (eindex - sindex) + 1;
        int temp[] = new int[size];

        int j = 0;
        
        for(int i = sindex; i <= eindex; i++) {
            temp[j] = myarr[i];
            j++;
        }

        System.out.println("Sub Array:");
        for(int k = 0; k < temp.length; k++) {
            System.out.print(temp[k] + " ");
        }

        return temp;
    }
}
