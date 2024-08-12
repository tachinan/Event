package Event;
import java.util.ArrayList;

public class ScoreSource{
    private String source;
    private ArrayList<ScoreListener> listeners;
    public ScoreSource(){
        listeners = new ArrayList<>();
    }

    public void setScoreLine(String val){
        source = val;
        fireMyevent(new ScoreEvent(this, source));
    }
    public String getScoreLine(){
        return source;
    }
    public void addScoreListener(ScoreListener l) {
        listeners.add(l);
    }
    public void removeScoreListener(ScoreListener l) {
        listeners.remove(l);
    }

    public void fireMyevent(ScoreEvent e){
        for(int i = 0; i < listeners.size(); i++){
            ScoreListener l = listeners.get(i);
            l.changeMyvalue(e);
        }
    }
}