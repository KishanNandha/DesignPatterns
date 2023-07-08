package CreationalDesignPatterns.abstractFactory;

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button.");
    }
}
