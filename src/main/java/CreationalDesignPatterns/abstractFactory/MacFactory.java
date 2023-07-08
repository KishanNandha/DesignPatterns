package CreationalDesignPatterns.abstractFactory;

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
