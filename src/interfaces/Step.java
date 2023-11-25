package interfaces;

import entities.Context;
import entities.drawflow.Flow;
import entities.drawflow.Node;

public interface Step {
    Context process(Flow flow, Node node,Context context);
}
