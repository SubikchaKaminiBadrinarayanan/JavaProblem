import java.util.ArrayList;
import java.util.Random;

class Scheduler {
    private ArrayList<Team> teams;
    private ArrayList<Game> games;
    private int consecutiveFreezingWeeks;

    public Scheduler(ArrayList<Team> teams) {
        this.teams = teams;
        this.games = new ArrayList<>();
        this.consecutiveFreezingWeeks = 0;
    }

    public void scheduleGames(int temperature) {
        if (temperature <= 32) {
            consecutiveFreezingWeeks++;
            if (consecutiveFreezingWeeks == 3) {
                endSeason();
            }
            return;
        } else {
            consecutiveFreezingWeeks = 0;
        }

        Random random = new Random();
        Team team1;
        Team team2;

        do {
            team1 = teams.get(random.nextInt(teams.size()));
            team2 = teams.get(random.nextInt(teams.size()));
        } while (team1 == team2);

        games.add(new Game(temperature, team1, team2));
        games.add(new Game(temperature, team2, team1));
    }

    public void endSeason() {
        printResults();
        System.exit(0);
    }

    public void printResults() {
        System.out.println("*********RESULTS*********");
        for (Team team : teams) {
            System.out.println(team.getName());
            System.out.println("Wins: " + team.getWins() + ", Losses: " + team.getLosses() + ", Ties: " + team.getTies());
            System.out.println("Points Scored: " + team.getGoalsScored() + ", Points Allowed: " + team.getGoalsAllowed());
        }

        for (Game game : games) {
            System.out.println(game);
        }

        int hottestTemp = 0;
        int totalTemp = 0;
        for (Game game : games) {
            totalTemp += game.getTemperature();
            if (game.getTemperature() > hottestTemp) {
                hottestTemp = game.getTemperature();
            }
        }

        double averageTemp = (double) totalTemp / games.size();
        System.out.println("Hottest Temp: " + hottestTemp);
        System.out.println("Average Temp: " + averageTemp);
    }
}

