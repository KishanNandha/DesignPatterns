package BehavioralDesignPatterns.Adapter;

class SocketAdapter implements Socket {
    private EuropeanSocket europeanSocket;

    public SocketAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    public void plugIn(String appliance) {
        europeanSocket.connect(appliance);
    }

    public void convertToUSPlug() {
        System.out.println("Adapter converting European plug to US plug");
    }
}