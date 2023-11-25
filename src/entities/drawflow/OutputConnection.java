package entities.drawflow;

public class OutputConnection {
    private String node;
    private String output;
    public String getNode() {
        return node;
    }
    public void setNode(String node) {
        this.node = node;
    }
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public OutputConnection(String node, String output){
        this.node = node;
        this.output = output;
    }
}
