import java.util.ArrayList;
import java.util.Collections;

public class Diary {
    private ArrayList<Job> jobsList;

    public Diary(){
        this.jobsList = new ArrayList<>();
    }

    public void addJob (Job newJob){
        this.jobsList.add(newJob);
    }
    public void sortDiary () {
        Collections.sort (this.jobsList);
    }

}
