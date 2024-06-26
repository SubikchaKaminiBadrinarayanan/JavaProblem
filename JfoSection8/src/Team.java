class Team {
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int goalsScored;
    private int goalsAllowed;

    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.goalsScored = 0;
        this.goalsAllowed = 0;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void recordGame(int goalsScored, int goalsAllowed) {
        this.goalsScored += goalsScored;
        this.goalsAllowed += goalsAllowed;
        if (goalsScored > goalsAllowed) {
            wins++;
        } else if (goalsScored < goalsAllowed) {
            losses++;
        } else {
            ties++;
        }
    }
}
