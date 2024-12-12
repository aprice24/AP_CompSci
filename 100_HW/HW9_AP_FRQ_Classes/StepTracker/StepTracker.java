public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int daysRecorded;
    private int activeDaysCount;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.daysRecorded = 0;
        this.activeDaysCount = 0;
    }

    public void addDailySteps(int dailySteps) {
        totalSteps += dailySteps;
        daysRecorded++;
            if (dailySteps >= minSteps) {
                activeDaysCount++;
        }
    }

    public int activeDays() {
        return activeDaysCount;
    }

    public double averageSteps() {
        if (daysRecorded == 0) {
            return 0.0;
        }
        return (double) totalSteps / daysRecorded;
    }
}
