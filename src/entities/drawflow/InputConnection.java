package entities.drawflow;

public class InputConnection {
    private String node;
    private String input;
    public String getNode() {
        return node;
    }
    public void setNode(String node) {
        this.node = node;
    }
    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public InputConnection(String node, String input){
        this.node = node;
        this.input = input;
    }
}
