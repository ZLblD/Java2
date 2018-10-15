package Marathon;

public class Course {

//    Competitor[] participants;

    Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }


    void start(Team team) {
        for (Competitor c : team.participants ) {
            for (Obstacle o : obstacles) {
                o.doit(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
