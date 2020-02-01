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

    public void setOverallGamesWon(int scoreOverall) {
        if (scoreOverall > 0) {
            gamesWon.add(1);
            }
        else if (scoreOverall == 0){
            gamesDrawn.add(1);
            }
        else if (scoreOverall < 0) {
            gamesLost.add(1);
            }
        else{
            System.out.println("Invalid Response");
            }
        }

    @Override
    public String toString() {
        return "RugbyTeam{" +
                "teamName='" + teamName + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", matchesWon=" + matchesWon +
                ", matchesLost=" + matchesLost +
                ", matchesDrawn=" + matchesDrawn +
                ", scoreFor=" + scoreFor +
                ", scoreAgainst=" + scoreAgainst +
                ", pointsDifference=" + pointsDifference +
                ", pointsOverall=" + pointsOverall +
                ", scoreOverall=" + scoreOverall +
                '}';
    }

    public static void main(String[] args){

        RugbyTeam leeds = new RugbyTeam("Leeds Rhinos");
        leeds.setScore(35,10);
        System.out.println(String.format("%-25s %4s", leeds.getTeamName(), leeds.getScore()));


        RugbyTeam hudds = new RugbyTeam("Huddersfield Giants");
        hudds.setScore(10,35);
        System.out.println(String.format("%-25s %4s", hudds.getTeamName(), hudds.getScore()));
    }
}
