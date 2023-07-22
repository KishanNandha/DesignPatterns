package BehavioralDesignPatterns.StatePattern;

public class GradingSystem {
    private GradingState currentState;

    public GradingSystem() {
        // Initialize the grading system with the Fail state
        currentState = new FailState();
    }

    public void setState(GradingState state) {
        currentState = state;
    }

    public String getGrade(int marks) {
        return currentState.getGrade(marks);
    }
}