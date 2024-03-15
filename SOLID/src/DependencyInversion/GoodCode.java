package DependencyInversion;

// Good code adhering to Dependency Inversion Principle

// Abstraction representing a media player
interface GoodMediaPlayer {
    void play();

    void stop();
}

// Low-level module representing a WindowsMediaPlayer
class GoodWindowsMediaPlayer implements GoodMediaPlayer {
    @Override
    public void play() {
        System.out.println("Windows Media Player is playing");
    }

    @Override
    public void stop() {
        System.out.println("Windows Media Player is stopped");
    }
}

// High-level module representing a MediaController
class GoodMediaController {
    private GoodMediaPlayer mediaPlayer;

    // Dependency Injection: High-level module depends on an abstraction (GoodMediaPlayer).
    public GoodMediaController(GoodMediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void playMedia() {
        mediaPlayer.play();
    }

    public void stopMedia() {
        mediaPlayer.stop();
    }
}

// Main class demonstrating the adherence to DIP
class GoodDIPMediaExample {
    public static void main(String[] args) {
        // Dependency Injection: Application can use any implementation of media player.
        GoodMediaPlayer windowsMediaPlayer = new GoodWindowsMediaPlayer();
        GoodMediaController mediaController = new GoodMediaController(windowsMediaPlayer);

        mediaController.playMedia();
        mediaController.stopMedia();
    }
}