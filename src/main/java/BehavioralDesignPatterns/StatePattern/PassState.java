package BehavioralDesignPatterns.StatePattern;

public class PassState implements GradingState {
    @Override
    public String getGrade(int marks) {
        if (marks >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}