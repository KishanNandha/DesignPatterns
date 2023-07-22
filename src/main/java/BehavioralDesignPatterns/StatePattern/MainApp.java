package BehavioralDesignPatterns.StatePattern;

public class MainApp {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();

        System.out.println("Marks: 75, Grade: " + gradingSystem.getGrade(75)); // Output: Marks: 75, Grade: Pass
        System.out.println("Marks: 40, Grade: " + gradingSystem.getGrade(40)); // Output: Marks: 40, Grade: Fail

        // Change the state to PassState
        gradingSystem.setState(new PassState());

        System.out.println("Marks: 75, Grade: " + gradingSystem.getGrade(75)); // Output: Marks: 75, Grade: Pass
        System.out.println("Marks: 40, Grade: " + gradingSystem.getGrade(40)); // Output: Marks: 40, Grade: Pass
    }
}