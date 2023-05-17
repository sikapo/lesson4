// 3, 4, 5, 6, 7, 8, 9
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Petro", 1000, 2),
                new Cat("Barsik", 500, 3),
                new Robot("Pylesos", 2000, 4)
        };

        Obstacle[] obstacles = {
                new Treadmill(900),
                new Wall(1),
                new Treadmill(1500),
                new Wall(2),
                new Treadmill(2000),
                new Wall(3)
        };

        for (Participant participant : participants) {
            boolean didNotOvercomeObstacle = false;

            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    didNotOvercomeObstacle = true;
                    break;
                }
            }

            if (didNotOvercomeObstacle) {
                System.out.println(participant.getName() + " is out of the game.");
            } else {
                System.out.println(participant.getName() + " finished the path!");
            }
        }
    }
}