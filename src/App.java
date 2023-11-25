import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Context;
import entities.data.ConsoleData;
import entities.data.HttpRequestData;
import entities.drawflow.*;
import workflow.Workflow;
public class App {
    public static void main(String[] args) throws Exception {
        //create node data        
        HttpRequestData httpRequestData = new HttpRequestData("https://dog-api.kinduff.com/api/facts","GET","http_status","http_contenttype","http_content");
        ConsoleData consoleData = new ConsoleData("Dog facts: {{http_content}}");

        //create node connection
        List<OutputConnection> httpToConsole = new ArrayList<>();
        httpToConsole.add(new OutputConnection("2","input_1"));
        List<InputConnection> consoleFromHttp = new ArrayList<>();
        consoleFromHttp.add(new InputConnection("1", "output_1"));
        
        Map<String, NodeInput> httpInput = new HashMap<>();
        Map<String, NodeOutput> httpOutput = new HashMap<>();

        Map<String, NodeInput> consoleInput = new HashMap<>();
        Map<String, NodeOutput> consoleOutput = new HashMap<>();

        httpOutput.put("output_1",new NodeOutput(httpToConsole));
        consoleInput.put("input_1", new NodeInput(consoleFromHttp));

        //create node
        Node httpNode = new Node("1","HttpRequestNode",httpRequestData,"","","",httpInput,httpOutput,0,0);
        Node consoleNode = new Node("2","ConsoleNode",consoleData,"","","",consoleInput,consoleOutput,0,0);

        Map<String, Node> nodes = new HashMap<>();
        nodes.put("1", httpNode);
        nodes.put("2", consoleNode);

        //create page
        FlowPage homePage = new FlowPage(nodes);
        Map<String, FlowPage> pages = new HashMap<>();
        pages.put("Home", homePage);

        //create flow
        Flow flow = new Flow(pages);

        //execute flow
        Workflow workflow = new Workflow();
        Context context = workflow.run(flow);
        String output = context.get("http_content");
        
        System.out.println(output);        
    }
}
