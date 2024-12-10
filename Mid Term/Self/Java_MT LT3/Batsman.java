
public class Batsman extends Cricketer {
    private int totalRuns;
    private int innings;
    private int notOuts;

    public Batsman() {}

    public Batsman(String name, int age, String team, int matches, int totalRuns, int innings, int notOuts) {
        super(name, age, team, matches);
        this.totalRuns = totalRuns;
        this.innings = innings;
        this.notOuts = notOuts;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getInnings() {
        return innings;
    }

    public void setNotOuts(int notOuts) {
        this.notOuts = notOuts;
    }

    public int getNotOuts() {
        return notOuts;
    }

    public double avgRun() {
        return (double) totalRuns / (innings - notOuts);
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Runs: " + totalRuns + ", Innings: " + innings + ", Not Outs: " + notOuts +
                ", Batting Average: " + avgRun());
    }
}
