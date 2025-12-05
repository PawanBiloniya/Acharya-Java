package swap;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Alphabet A to Z: ");
        char choice = sc.next().charAt(0);

        char[] arr = new char[26];

        if(choice == 'A') {
            for(int i = 0; i < 26; i++) {
                arr[i] = (char)('A' + i);
            }
        } 

       
       

  
        for(char c : arr) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
