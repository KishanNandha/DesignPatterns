package BehavioralDesignPatterns.StatePattern;

public class FailState implements GradingState {
    @Override
    public String getGrade(int marks) {
        if (marks >= 50) {
            return "Fail";
        } else {
            return "Fail";
        }
    }
}