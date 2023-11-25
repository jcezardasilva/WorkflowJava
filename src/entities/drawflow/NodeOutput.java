package entities.drawflow;

import java.util.ArrayList;
import java.util.List;

public class NodeOutput {
	public List<OutputConnection> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<OutputConnection> outputs) {
        this.outputs = outputs;
    }

    private List<OutputConnection> outputs = new ArrayList<>();
    public NodeOutput(List<OutputConnection> outputs){
        this.outputs = outputs;
    }
}
