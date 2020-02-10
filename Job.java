public class Job {
    private String jobName;
    private int jobPriority;
    private boolean isFinished;


    public Job(String jobName, int jobPriority, boolean isFinished){
        this.jobName = jobName;
        this.jobPriority = jobPriority;
        this.isFinished = isFinished;
    }

    public String getJobName() {
        return jobName;
    }


    public int getJobPriority() {
        return jobPriority;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return jobName + " " + jobPriority + " " + isFinished;
    }

}
