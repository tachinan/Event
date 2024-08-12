package Event;

import java.util.EventObject;

public class ScoreEvent extends EventObject {
    private String myValue;
    public ScoreEvent(Object source, String val){
        super(source);
        myValue = val;
    }
    public String getMyvalue(){
        return myValue;
    }
}
