package InterfaceSegregation;

// Good code adhering to Interface Segregation Principle

// Interface representing a football player
interface GoodFootballPlayer {
    void play();

    void train();

    void takeBreak();
}

// Interface representing a football coach
interface GoodFootballCoach {
    void train();

    void attendMeeting();

    void takeBreak();
}

// Class representing a forward player implementing the GoodFootballPlayer interface
class GoodForwardPlayer implements GoodFootballPlayer {
    @Override
    public void play() {
        System.out.println("Forward Player - Scoring goals");
    }

    @Override
    public void train() {
        System.out.println("Forward Player - Training for agility");
    }

    @Override
    public void takeBreak() {
        System.out.println("Forward Player - Taking a break");
    }
}

// Class representing a coach implementing the GoodFootballCoach interface
class GoodCoach implements GoodFootballCoach {
    @Override
    public void train() {
        System.out.println("Coach - Conducting training sessions");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Coach - Attending coaching strategy meeting");
    }

    @Override
    public void takeBreak() {
        System.out.println("Coach - Taking a break");
    }
}

class GoodFootballExample {
    public static void main(String[] args) {
        GoodFootballPlayer forwardPlayer = new GoodForwardPlayer();
        forwardPlayer.play();
        forwardPlayer.train();
        forwardPlayer.takeBreak();

        GoodFootballCoach coach = new GoodCoach();
        coach.train();
        coach.attendMeeting();
        coach.takeBreak();
    }
}