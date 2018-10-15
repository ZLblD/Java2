package Marathon;

public class Team {

    String title;
    Competitor [] participants;

    public Team(String title, Competitor... participants) {
        this.title = title;
        this.participants = participants;
    }

    void showResult(){
        for (Competitor c: participants) {
            if(c.isOnDistance()){
            c.info();
            }
        }
    }
}
