package BehavioralDesignPatterns.StrategyPattern;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFile(String file) {
        compressionStrategy.compress(file);
    }
}