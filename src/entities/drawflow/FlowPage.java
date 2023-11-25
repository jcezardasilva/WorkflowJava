package entities.drawflow;

import java.util.HashMap;
import java.util.Map;

public class FlowPage {
	private Map<String, Node> map = new HashMap<>();

    public Map<String, Node> getMap() {
        return map;
    }

    public void setMap(Map<String, Node> map) {
        this.map = map;
    }
    public FlowPage(Map<String, Node> map){
        this.map = map;
    }
}
