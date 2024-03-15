package InterfaceSegregation;

// Bad code violating Interface Segregation Principle

// Interface representing a football team member
interface BadFootballTeamMember {
    void play();

    void train();

    void attendMeeting();

    void takeBreak();
}

// Class representing a forward player implementing the BadFootballTeamMember interface
class BadForwardPlayer implements BadFootballTeamMember {
    @Override
    public void play() {
        System.out.println("Forward Player - Scoring goals");
    }

    @Override
    public void train() {
        System.out.println("Forward Player - Training for agility");
    }

    @Override
    public void attendMeeting() {
        // Not applicable to forward players, but still required to implement
        System.out.println("Forward Player - Attending team meeting");
    }

    @Override
    public void takeBreak() {
        System.out.println("Forward Player - Taking a break");
    }
}

// Class representing a coach implementing the BadFootballTeamMember interface
class BadCoach implements BadFootballTeamMember {
    @Override
    public void play() {
        // Not applicable to coaches, but still required to implement
        System.out.println("Coach - Participating in team play");
    }

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

class BadFootballExample {
    public static void main(String[] args) {
        BadFootballTeamMember forwardPlayer = new BadForwardPlayer();
        forwardPlayer.play();
        forwardPlayer.train();
        forwardPlayer.attendMeeting();  // Should not be applicable to a forward player
        forwardPlayer.takeBreak();

        BadFootballTeamMember coach = new BadCoach();
        coach.play();  // Should not be applicable to a coach
        coach.train();
        coach.attendMeeting();
        coach.takeBreak();
    }
}