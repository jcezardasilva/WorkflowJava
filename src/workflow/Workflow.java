package workflow;
import java.util.Map;

import entities.Context;
import entities.drawflow.Flow;
import entities.drawflow.Node;

public class Workflow {
    private NodeSteps nodeSteps;
    public Workflow(){
        nodeSteps = new NodeSteps();
    }

    public Context run(Flow flow){
        Context context = new Context();
        context.put("Flow", flow);
        return processNext(flow, context);
    }
    public Context run(Flow flow, Map<String,String> input){
        Context context = new Context();
        context.put("Flow", flow);
        input.forEach((key,value)-> context.put(key, value));
        
        return processNext(flow, context);
    }
    private Context processNext(Flow flow, Context context){
        Node node = NodeService.getStartNode(flow);
        
        while (node != null) {
            context = nodeSteps.getStep(node.getName()).process(flow, node, context);
            node = NodeService.getNextNode(context);
        }
        return context;
    }
}
