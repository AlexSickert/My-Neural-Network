/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myneuralnetwork;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class OutputLayer extends Layer {

    ArrayList l;

    public OutputLayer(int nodes, ArrayList nodeReference) {

        Log.info("creating output layer");

        l = new ArrayList();
        for (int i = 0; i < nodes; i++) {
            l.add(new OutputNode(nodeReference));
        }

    }

    public ArrayList getNodeReferences() {
        return l;
    }

    public void forward() {

        OutputNode n;

        for (int i = 0; i < l.size(); i++) {
            Log.info("setting value");
            n = (OutputNode) l.get(i);
            n.calculateForward();
        }

    }

    public void backward() {
        Log.info("to do - backward() in OutputLayer");
    }

    public void update() {
        Log.info("to do - update in OutputLayer");
    }

}
