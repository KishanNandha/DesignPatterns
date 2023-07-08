package CreationalDesignPatterns.abstractFactory;

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
