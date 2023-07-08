package CreationalDesignPatterns.abstractFactory;

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button.");
    }
}