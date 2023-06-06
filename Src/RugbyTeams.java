import java.util.Arrays;
import java.util.Random;

public class RugbyTeams {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        Random random = new Random();
        int[] team1Ages = new int[teamSize];
        int[] team2Ages = new int[teamSize];

        for (int i = 0; i < team1Ages.length; i++) {
            team1Ages[i] = random.nextInt(maxAge - minAge + 1) + minAge;
            team2Ages[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }

        System.out.println("Age of first team players: " + Arrays.toString(team1Ages));
        System.out.println("Age of second team players: " + Arrays.toString(team2Ages));

        int team1AgeSum = 0;
        int team2AgeSum = 0;

        for (int age : team1Ages) {
            team1AgeSum += age;
        }
        for (int age : team2Ages){
            team2AgeSum += age;
        }

        double team1AvgAge = (double) team1AgeSum / teamSize;
        double team2AvgAge = (double) team2AgeSum / teamSize;

        System.out.println("Average age of first team players: " + team1AvgAge);
        System.out.println("Average age of second team players: " + team2AvgAge);
    }
}