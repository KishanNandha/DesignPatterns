package BehavioralDesignPatterns.Adapter;

class EuropeanSocket {
    public void connect(String appliance) {
        System.out.println("European socket connected to " + appliance);
    }
}