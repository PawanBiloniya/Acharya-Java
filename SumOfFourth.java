package swap;

import java.util.Scanner;

public class SumOfFourth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[4];
        int sum = 0;

        System.out.println("Enter 4 Numbers:");

        for (int i = 0; i < 4; i++) {
            number[i] = sc.nextInt(); 
            sum = sum + number[i];   
        }

        System.out.println("Sum of 4 Numbers: " + sum);
    }
}
