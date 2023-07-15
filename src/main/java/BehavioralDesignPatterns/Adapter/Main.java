package BehavioralDesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        // Step 7: Use the adapter class in the client code
        EuropeanSocket europeanSocket = new EuropeanSocket();
        SocketAdapter socketAdapter = new SocketAdapter(europeanSocket);

        socketAdapter.convertToUSPlug(); // Convert the European socket to a US socket
        socketAdapter.plugIn("Laptop"); // This will call EuropeanSocket's connect method through the adapter
        socketAdapter.plugIn("Mobile Phone"); // This will call EuropeanSocket's connect method through the adapter
    }
}