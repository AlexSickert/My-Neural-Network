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

        l = new ArrayList();
        for (int i = 0; i < nodes; i++) {
            l.add(new InputNode());
        }

    }

    public ArrayList getNodeReferences() {
        return l;
    }

    public void forward() {
    }

    public void backward() {
    }

    public void update() {
    }

}
