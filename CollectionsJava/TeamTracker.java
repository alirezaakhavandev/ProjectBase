import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TeamTracker {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();

        Team alpha = new Team("Alpha");
        alpha.addPlayer(new Player("Ethan"));
        alpha.addPlayer(new Player("Raze"));

        Team alphaCopy = new Team("alpha"); 
        alphaCopy.addPlayer(new Player("Ethan"));
        alphaCopy.addPlayer(new Player("Raze"));

        Team beta = new Team("Beta");
        beta.addPlayer(new Player("Ethan"));

        teams.add(alpha);
        teams.add(alphaCopy); 
        teams.add(beta);

        System.out.println("Tracked teams:");
        for (Team t : teams) {
            System.out.println(t);
        }
    }
}

class Team {
    String name;
    Set<Player> players;

    Team(String name) {
        this.name = name;
        this.players = new HashSet<>();
    }

    void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equalsIgnoreCase(team.name) && players.equals(team.players);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(), players);
    }

    @Override
    public String toString() {
        return name + " → " + players;
    }
}

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    // 😈 missing something?
}
