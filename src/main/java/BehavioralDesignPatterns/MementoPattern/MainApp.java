package BehavioralDesignPatterns.MementoPattern;

public class MainApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        textEditor.appendText("Hello, ");
        history.saveMemento(textEditor.save());

        textEditor.appendText("world!");
        System.out.println("Current text: " + textEditor.getText()); // Output: Current text: Hello, world!

        textEditor.restore(history.getMemento());
        System.out.println("Text after restoring: " + textEditor.getText()); // Output: Text after restoring: Hello,
    }
}