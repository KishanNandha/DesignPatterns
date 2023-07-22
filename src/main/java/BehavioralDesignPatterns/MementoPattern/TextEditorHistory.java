package BehavioralDesignPatterns.MementoPattern;

import java.util.Stack;

public class TextEditorHistory {
    private Stack<TextMemento> mementos = new Stack<>();

    public void saveMemento(TextMemento memento) {
        mementos.push(memento);
    }

    public TextMemento getMemento() {
        return mementos.pop();
    }
}