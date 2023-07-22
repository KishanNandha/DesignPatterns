package BehavioralDesignPatterns.StrategyPattern;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String file) {
        System.out.println("Compressing " + file + " using RAR compression.");
    }
}