
public class Cricketer {
    private String name;
    private int age;
    private String team;
    private int matches;

    public Cricketer() {}

    public Cricketer(String name, int age, String team, int matches) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.matches = matches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getMatches() {
        return matches;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Team: " + team + ", Matches: " + matches);
    }
}
