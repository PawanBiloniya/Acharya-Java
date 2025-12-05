package swap;

		import java.util.Scanner;

		public class GPLMatch {
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);

		        String team1 = "Jetha Ke Jaanbaaz";
		        String team2 = "Bindass Bhide";

		        System.out.print("Enter score of " + team1 + ": ");
		        int score1 = scan.nextInt();
		        System.out.print("Enter score of " + team2 + ": ");
		        int score2 = scan.nextInt();

		        if(score1 > score2)
		            System.out.println(team1 + " Win: " + score1);
		        else if(score2 > score1)
		            System.out.println(team2 + " Win: " + score2);
		        else
		            System.out.println("Match Tie! Both scored: " + score1);
		    }
	

	}

