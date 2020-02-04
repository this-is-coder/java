import java.util.ArrayList;

public class RugbyTeam {

    private String teamName;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesLost;
    private int matchesDrawn;
    private int scoreFor;
    private int scoreAgainst;
    private int pointsDifference;
    private int pointsOverall;
    private int scoreOverall;
    private ArrayList<Integer> gamesWon;
    private ArrayList<Integer> gamesLost;
    private ArrayList<Integer> gamesDrawn;
    private ArrayList<Integer> overallPoints;

    public RugbyTeam(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setScore(int scoreFor, int scoreAgainst){
        this.scoreFor = scoreFor;
        this.scoreAgainst = scoreAgainst;
        scoreOverall = scoreFor - scoreAgainst;
    }

    public int getScore(){
        return scoreOverall;
    }

    public int getScoreFor(){
        return scoreFor;
    }

    public int getScoreAgainst(){
        return scoreAgainst;
    }

    public void setOverallPoints (int scoreOverall){
        if (scoreOverall > 0){
            pointsOverall += 2;
        }else if (scoreOverall == 0){
            pointsOverall += 1;
        }else if (scoreOverall < 0){
            pointsOverall += 0;
        }else{
            System.out.println("Invalid!");
        }
    }

    public int getOverallPoints(){
        return pointsOverall;
    }

    public static void main(String[] args){

        System.out.println(String.format("%-27s %-15s %13s %18s %22s", "Team", "Points", "Overall Score", "Score For", "Score Against\n"));
        
        RugbyTeam leeds = new RugbyTeam("Leeds Rhinos");
        leeds.setScore(25,15);
        leeds.setOverallPoints(leeds.scoreOverall);
        System.out.println(String.format("%-25s %5s %19s %21s %20s", leeds.getTeamName(), leeds.getOverallPoints(), leeds.getScore(), leeds.getScoreFor(), leeds.getScoreAgainst()));

        RugbyTeam hudds = new RugbyTeam("Huddersfield Giants");
        hudds.setScore(15,25);
        hudds.setOverallPoints(hudds.scoreOverall);
        System.out.println(String.format("%-25s %5s %19s %21s %20s", hudds.getTeamName(), hudds.getOverallPoints(), hudds.getScore(), hudds.getScoreFor(), hudds.getScoreAgainst()));

        RugbyTeam hull = new RugbyTeam("Hull FC");
        System.out.println(String.format("%-25s %5s %19s %21s %20s", hull.getTeamName(), hull.getOverallPoints(), hull.getScore(), hull.getScoreFor(), hull.getScoreAgainst()));

        RugbyTeam wigan = new RugbyTeam("Wigan Warriors");
        System.out.println(String.format("%-25s %5s %19s %21s %20s", wigan.getTeamName(), wigan.getOverallPoints(), wigan.getScore(), wigan.getScoreFor(), wigan.getScoreAgainst()));
    }
}
