class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.getMaxJumpHeight()>= height) {
            System.out.println(participant.getName() + " climbed over the wall");
            return true;
        } else {
            System.out.println(participant.getName()+ " did not climb over the wall");
            return false;
        }
    }
}