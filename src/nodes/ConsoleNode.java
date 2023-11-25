package nodes;

import entities.Context;
import entities.data.ConsoleData;
import entities.drawflow.Flow;
import entities.drawflow.Node;
import interfaces.Step;
import workflow.NodeService;

public class ConsoleNode implements Step {

    @Override
    public Context process(Flow flow, Node node, Context context) {
        ConsoleData data = node.getData();
    
        String text = NodeService.setValues(data.getMessage(), context);
        System.out.println(text);
        
        NodeService.setNextNode(flow, node, context, "output_1");
        return context;
    }
    
}
