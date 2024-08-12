package Event;

import java.util.EventListener;

public interface ScoreListener extends EventListener {

    public void changeMyvalue(ScoreEvent e);
} 
