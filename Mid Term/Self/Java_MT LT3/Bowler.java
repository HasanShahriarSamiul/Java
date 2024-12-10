
public class Bowler extends Cricketer {
    private int totalWkts;
    private int ballsBowled;
    private int runsConceded;

    public Bowler() {}

    public Bowler(String name, int age, String team, int matches, int totalWkts, int ballsBowled, int runsConceded) {
        super(name, age, team, matches);
        this.totalWkts = totalWkts;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void setTotalWkts(int totalWkts) {
        this.totalWkts = totalWkts;
    }

    public int getTotalWkts() {
        return totalWkts;
    }

    public void setBallsBowled(int ballsBowled) {
        this.ballsBowled = ballsBowled;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public double avgWkt() {
        return (double) totalWkts / getMatches();
    }

    public double economyRate() {
        return (double) (runsConceded * 6) / ballsBowled;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Wickets: " + totalWkts + ", Balls Bowled: " + ballsBowled +
                ", Runs Conceded: " + runsConceded + ", Average Wickets: " + avgWkt() +
                ", Economy Rate: " + economyRate());
    }
}
