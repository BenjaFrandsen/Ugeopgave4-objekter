import java.util.ArrayList;

public class Team {

    String teamName;
    ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
        System.out.println("player " + p.name + " joined team " + teamName);

    }

    public double getAverageSkill() {
        double sum = 0;
        for (Player player: players) {
            sum+= player.skillLevel;
        }
        return sum / players.size();
    }

    public void printTeam() {
        System.out.println("---------------" + teamName + "--------");
        for(Player player: players) {
            System.out.println("Player name: " + player.name + "Skill " + player.skillLevel);
        }
    }

    public void compete(Team awayTeam) {
        double homeTeamSkill = getAverageSkill();
        double awayTeamSkill = awayTeam.getAverageSkill();



        if (homeTeamSkill > awayTeamSkill) {
            System.out.println("Winner: " + teamName);
        } else if (awayTeamSkill > homeTeamSkill) {
            System.out.println("Winner: " + awayTeam.teamName);
        } else {
            System.out.println("Match ended in a tie!");
        }



    }





}
