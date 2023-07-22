package BehavioralDesignPatterns.StrategyPattern;

public class MainApp {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext();

        // Using ZIP compression strategy
        context.setCompressionStrategy(new ZipCompressionStrategy());
        context.compressFile("file.txt");

        // Using RAR compression strategy
        context.setCompressionStrategy(new RarCompressionStrategy());
        context.compressFile("image.jpg");
    }
}