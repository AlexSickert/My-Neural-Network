/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myneuralnetwork;

/**
 *
 * @author alex
 */
public class MyNeuralNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InputLayer i = new InputLayer(2);
        HiddenLayer h = new HiddenLayer(2, i.getNodeReferences());
        OutputLayer o = new OutputLayer(2, h.getNodeReferences());

//        Now we need to fill the values
//        train
        for (int x = 0; x < 5; x++) {

            i.forward();
            h.forward();
            o.forward();

            o.backward();
            h.backward();
            i.backward();

            o.update();
            h.update();
            i.update();

        }

    }

}
