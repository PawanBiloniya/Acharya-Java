package swap;

import java.util.Scanner;

public class BillAmount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Bill Amount");
        
        double TotalAmount = 6000;
        
        double discount = 0;
        if (TotalAmount > 3000) {
            discount = TotalAmount * 0.15;  
        }
            else if (TotalAmount > 2000) {
            discount = TotalAmount * 0.08;  }
        else {
            discount = 0;
        }
        double finalAmount = TotalAmount - discount;
        System.out.println("Total Bill Amount: " + TotalAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Total Amount After Discount: " + finalAmount);
    }
}
