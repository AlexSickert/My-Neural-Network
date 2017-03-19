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
public class HiddenLayer extends Layer {

    ArrayList l; // list of nodes
   

    public HiddenLayer(int nodes, ArrayList nodeReference) {
        
        Log.info("creating hidden layer");

        l = new ArrayList();
        
        
        for (int i = 0; i < nodes; i++) {
            l.add(new Node(nodeReference));
            
        }

    }

    public ArrayList getNodeReferences() {
        return l;
    }

    public void forward() {
        
        Node n;

        for (int i = 0; i < l.size(); i++) {
            Log.info("setting value");
            n = (Node) l.get(i);
            n.calculateForward();
        }
        
    }

    public void backward() {
        Log.info("to do - backward() in HiddenLayer");
    }

    public void update() {
        Log.info("to do - update in HiddenLayer");
    }
}
