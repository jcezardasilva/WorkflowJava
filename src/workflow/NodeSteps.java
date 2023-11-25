package workflow;
import java.util.HashMap;
import java.util.Map;

import interfaces.Step;
import nodes.ConsoleNode;
import nodes.HttpRequestNode;

public class NodeSteps {
    private Map<String, Object> map = new HashMap<>();
    
    public NodeSteps(){
        map.put("HttpRequestNode", new HttpRequestNode());
        map.put("ConsoleNode", new ConsoleNode());
    }
    Step getStep(String name){
        return (Step)map.get(name);
    }
}
