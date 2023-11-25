package entities.drawflow;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private String id;
    private String name;
	private Object data;   
    private String className;
    private String html;
    private String typenode;
	private Map<String, NodeInput> inputs = new HashMap<>();   
	private Map<String, NodeOutput> outputs = new HashMap<>();   
    private int posX;
    private int posY;
        
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
	@SuppressWarnings("unchecked")
    public <T> T getData() {
        return (T)data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getHtml() {
        return html;
    }
    public void setHtml(String html) {
        this.html = html;
    }
    public String getTypenode() {
        return typenode;
    }
    public void setTypenode(String typenode) {
        this.typenode = typenode;
    }
    public Map<String, NodeInput> getInputs() {
        return inputs;
    }
    public void setInputs(Map<String, NodeInput> inputs) {
        this.inputs = inputs;
    }
    public Map<String, NodeOutput> getOutputs() {
        return outputs;
    }
    public void setOutputs(Map<String, NodeOutput> outputs) {
        this.outputs = outputs;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Node(String id, 
    String name, 
    Object data, 
    String className, 
    String html, 
    String typenode,
    Map<String, NodeInput> inputs, 
    Map<String, NodeOutput> outputs,
    int posX,
    int posY){
        this.id = id;
        this.name = name;
        this.data = data;
        this.className = className;
        this.html = html;
        this.typenode = typenode;
        this.inputs = inputs;
        this.outputs = outputs;
        this.posX = posX;
        this.posY = posY;
    }
}
