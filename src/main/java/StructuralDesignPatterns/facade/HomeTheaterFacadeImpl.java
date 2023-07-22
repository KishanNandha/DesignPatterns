package StructuralDesignPatterns.facade;

class HomeTheaterFacadeImpl implements HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private AudioSystem audioSystem;

    public HomeTheaterFacadeImpl() {
        // Initialize the subsystems here
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.audioSystem = new AudioSystem();
    }

    public void watchMovie(String movie) {
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.setInput(dvdPlayer);
        projector.project();
        audioSystem.on();
        audioSystem.playAudio();
    }

    public void stopMovie() {
        dvdPlayer.stop();
        projector.setInput(null);
        projector.off();
        audioSystem.setVolume(0);
        audioSystem.off();
    }
}