class Treadmill implements Obstacle {
    int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxRunDistance() >= length) {
            System.out.println(participant.getName() + " overcame the treadmill");
            return true;
        } else {
            System.out.println(participant.getName() + " did not overcome the treadmill");
            return false;
        }
    }
}