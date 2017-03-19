/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myneuralnetwork;

import java.util.Random;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Node {

    private ArrayList inputNodeReference;
    private ArrayList weights;
    private ArrayList weightsUpdate;
    private float value;
    private float learningRate = (float) 0.01;

    public Node(ArrayList nodeReference) {
        inputNodeReference = nodeReference;

        weights = new ArrayList();

        for (int i = 0; i < inputNodeReference.size(); i++) {

            Random rand = new Random();
            float r = rand.nextFloat();
            Log.info("initialized node weight with " + r);
            weights.add(r);

        }
        
        Log.info("Node constructor called");  

    }

  

    public void calculateForward() {

        float tmp = 0;

        for (int i = 0; i < inputNodeReference.size(); i++) {

            Node n = (Node) inputNodeReference.get(i);

            Log.info("node value is " + n.getOutputValue() + " and weight is " + weights.get(i));

            tmp = tmp + ((float) n.getOutputValue() * (float) weights.get(i));

        }
        Log.info("calculated the value of node and set it to " + tmp);
        Log.info("to do: add SIGMOID here");
        value = tmp;

    }

    public void calculateBackward() {
        // uses

//    private ArrayList weights;
//    private ArrayList weightsUpdate;
    }

    public float getOutputValue() {

        return value;
    }

    public void setValue(float v) {
        value = v;

    }

}
