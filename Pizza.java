package swap;

import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Size (small / medium / large / xlarge):");
        
        String size = sc.nextLine().toLowerCase();
        int price;

        switch (size) {
            case "small":
                price = 125;
                break;

            case "medium":
                price = 250;
                break;

            case "large":
                price = 300;
                break;

            case "xlarge":
                price = 400;
                break;

            default:
                System.out.println("Invalid Size");
                return;
        }

        System.out.println("Price: " + price);
    }
}
