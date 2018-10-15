package Marathon;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Bob"), new Cat("Baksik"), new Dog("Bobick")};
//        Obstacle[] obstacles = {new Cross(80), new Wall(5), new Water(100)};
        Team team = new Team("Star" , new Human("Bob"), new Cat("Barsik"), new Dog("Bobick"), new Dog ("Sharick"));
        Course course = new Course(new Cross(80), new Wall(5), new Water(100));
        course.start(team);
        team.showResult();



    }
}
