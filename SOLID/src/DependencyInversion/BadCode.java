package DependencyInversion;

// Low-level module representing a WindowsMediaPlayer
class BadWindowsMediaPlayer {
    public void play() {
        System.out.println("Windows Media Player is playing");
    }

    public void stop() {
        System.out.println("Windows Media Player is stopped");
    }
}

// High-level module representing a MediaController
class BadMediaController {
    private BadWindowsMediaPlayer windowsMediaPlayer;

    // Violation Explanation: High-level module directly instantiates a low-level module.
    public BadMediaController() {
        this.windowsMediaPlayer = new BadWindowsMediaPlayer();
    }

    // Violation Explanation: High-level module directly calls a method on a specific low-level module.
    public void playMedia() {
        windowsMediaPlayer.play();
    }

    // Violation Explanation: High-level module directly calls a method on a specific low-level module.
    public void stopMedia() {
        windowsMediaPlayer.stop();
    }
}

// Main class demonstrating the violation of DIP
class BadDIPMediaExample {
    public static void main(String[] args) {
        // Violation Explanation: The application is tightly coupled to a specific implementation of media player.
        BadMediaController mediaController = new BadMediaController();
        mediaController.playMedia();
        mediaController.stopMedia();
    }
}