import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Batsman 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
		
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();
		
        System.out.print("Team: ");
        String team1 = scanner.nextLine();
        System.out.print("Matches: ");
        int matches1 = scanner.nextInt();
        System.out.print("Total Runs: ");
        int totalRuns1 = scanner.nextInt();
        System.out.print("Innings: ");
        int innings1 = scanner.nextInt();
        System.out.print("Not Outs: ");
        int notOuts1 = scanner.nextInt();

        Batsman batsman1 = new Batsman(name1, age1, team1, matches1, totalRuns1, innings1, notOuts1);

        System.out.println("Enter details for Batsman 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Team: ");
        String team2 = scanner.nextLine();
        System.out.print("Matches: ");
        int matches2 = scanner.nextInt();
        System.out.print("Total Runs: ");
        int totalRuns2 = scanner.nextInt();
        System.out.print("Innings: ");
        int innings2 = scanner.nextInt();
        System.out.print("Not Outs: ");
        int notOuts2 = scanner.nextInt();

        Batsman batsman2 = new Batsman(name2, age2, team2, matches2, totalRuns2, innings2, notOuts2);

        
        System.out.println("Enter details for Bowler 1:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        scanner.nextLine();
		
        System.out.print("Age: ");
        int age3 = scanner.nextInt();
        scanner.nextLine();
		
        System.out.print("Team: ");
        String team3 = scanner.nextLine();
        System.out.print("Matches: ");
        int matches3 = scanner.nextInt();
        System.out.print("Total Wickets: ");
        int totalWkts1 = scanner.nextInt();
        System.out.print("Balls Bowled: ");
        int ballsBowled1 = scanner.nextInt();
        System.out.print("Runs Conceded: ");
        int runsConceded1 = scanner.nextInt();

        Bowler bowler1 = new Bowler(name3, age3, team3, matches3, totalWkts1, ballsBowled1, runsConceded1);

        
        System.out.println("Enter details for Bowler 2:");
        System.out.print("Name: ");
        String name4 = scanner.nextLine();
        scanner.nextLine();
		
        System.out.print("Age: ");
        int age4 = scanner.nextInt();
        scanner.nextLine();
		
        System.out.print("Team: ");
        String team4 = scanner.nextLine();
        System.out.print("Matches: ");
        int matches4 = scanner.nextInt();
        System.out.print("Total Wickets: ");
        int totalWkts2 = scanner.nextInt();
        System.out.print("Balls Bowled: ");
        int ballsBowled2 = scanner.nextInt();
        System.out.print("Runs Conceded: ");
        int runsConceded2 = scanner.nextInt();

        Bowler bowler2 = new Bowler(name4, age4, team4, matches4, totalWkts2, ballsBowled2, runsConceded2);

        
        System.out.println("\nDetails of Batsman 1:");
        batsman1.displayDetails();

        System.out.println("\nDetails of Batsman 2:");
        batsman2.displayDetails();

        System.out.println("\nDetails of Bowler 1:");
        bowler1.displayDetails();

        System.out.println("\nDetails of Bowler 2:");
        bowler2.displayDetails();

        scanner.close();
    }
}
