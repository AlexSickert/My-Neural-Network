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
public class InputLayer extends Layer {

    private ArrayList l;

    public InputLayer(int nodes) {

        Log.info("creating input layer");

        l = new ArrayList();
        for (int i = 0; i < nodes; i++) {
            l.add(new InputNode());
        }

    }

    public void setValues(ArrayList v) {

        Log.info("setting values in input layer");

        if (v.size() == l.size()) {
            // fill
            InputNode n;

            for (int i = 0; i < v.size(); i++) {
                Log.info("setting value");
                n = (InputNode) l.get(i);
                n.setValue((float) v.get(i));
            }

        } else {
            // need to raise a proper error here
            System.out.println("array length not equal between input values and size of input layer... sutting down");
            System.exit(0);

        }

    }

    public ArrayList getNodeReferences() {
        return l;
    }

    public void forward() {

        InputNode n;

        for (int i = 0; i < l.size(); i++) {
            Log.info("setting value");
            n = (InputNode) l.get(i);
            n.calculateForward();
        }
    }

    public void backward() {
        Log.info("to do - backward() in InputLayer");
    }

    public void update() {
        Log.info("to do - update in InputLayer");
    }

}
