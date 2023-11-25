package entities.drawflow;

import java.util.ArrayList;
import java.util.List;

public class NodeInput {
	private List<InputConnection> inputs = new ArrayList<>();

    public List<InputConnection> getInputs() {
        return inputs;
    }

    public void setInputs(List<InputConnection> inputs) {
        this.inputs = inputs;
    }
    public NodeInput(List<InputConnection> inputs){
        this.inputs = inputs;
    }
}
