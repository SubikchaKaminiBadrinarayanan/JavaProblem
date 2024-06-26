import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SoccerLeague {
    public static void main(String[] args) {
        // Initialize teams
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");
        Team team3 = new Team("Team 3");
        Team team4 = new Team("Team 4");

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        // Initialize scheduler
        Scheduler scheduler = new Scheduler(teams);

        // Simulate soccer league season
        while (true) {
            String temperatureInput = JOptionPane.showInputDialog("Enter the temperature for the week:");
            try {
                int temperature = Integer.parseInt(temperatureInput);
                scheduler.scheduleGames(temperature);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid temperature. Please enter a valid number.");
            }
        }
    }
}