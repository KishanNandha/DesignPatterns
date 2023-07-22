package BehavioralDesignPatterns.StrategyPattern;

public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String file) {
        System.out.println("Compressing " + file + " using ZIP compression.");
    }
}