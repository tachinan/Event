package Event;

public class Subscriber implements ScoreListener{
    @Override
    public void changeMyvalue(ScoreEvent e){
        System.out.println("live result: "+e.getMyvalue());
    }
}
