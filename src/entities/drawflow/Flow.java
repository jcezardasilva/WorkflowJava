package entities.drawflow;

import java.util.HashMap;
import java.util.Map;

public class Flow {
	private Map<String, FlowPage> map = new HashMap<>();

    public Map<String, FlowPage> getMap() {
        return map;
    }

    public void setMap(Map<String, FlowPage> map) {
        this.map = map;
    }
    public Flow(Map<String, FlowPage> map){
        this.map = map;
    }
}
