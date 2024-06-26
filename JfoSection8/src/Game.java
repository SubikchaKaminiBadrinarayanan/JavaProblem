import java.util.Random;

class Game {
    private static int gameCount = 0;
    private int id;
    private int temperature;
    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamGoals;
    private int awayTeamGoals;

    public Game(int temperature, Team homeTeam, Team awayTeam) {
        this.id = ++gameCount;
        this.temperature = temperature;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        simulateGame();
    }

    public int getTemperature() {
        return temperature;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    private void simulateGame() {
        Random random = new Random();
        homeTeamGoals = random.nextInt(6);
        awayTeamGoals = random.nextInt(6);
        homeTeam.recordGame(homeTeamGoals, awayTeamGoals);
        awayTeam.recordGame(awayTeamGoals, homeTeamGoals);
    }

    @Override
    public String toString() {
        return "Game #" + id + "\nTemperature: " + temperature + "\nAway Team: " + awayTeam.getName() + ", " + awayTeamGoals
                + "\nHome Team: " + homeTeam.getName() + ", " + homeTeamGoals;
    }
}
