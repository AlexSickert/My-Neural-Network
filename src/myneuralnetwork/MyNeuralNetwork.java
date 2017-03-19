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
public class MyNeuralNetwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InputLayer i = new InputLayer(2);
        HiddenLayer h = new HiddenLayer(2, i.getNodeReferences());
        OutputLayer o = new OutputLayer(2, h.getNodeReferences());
        
        ErrorCalc e = new ErrorCalc();

//        Now we need to fill the values
        ArrayList values = new ArrayList();
        values.add((float) 2);
        values.add((float) 3);
        
        i.setValues(values);
 
        
        ArrayList ideal = new ArrayList();
        ideal.add((float) 4);
        ideal.add((float) 5);        
        
        // set the desired values for the output layer
        e.setReferences(o, ideal);
       
        

//        train
        for (int x = 0; x < 3; x++) {
            
            Log.info("----- loop " + x + " -----");

            // calculate forward
            i.forward();
            h.forward();
            o.forward();

            // calculate error            
            e.calculate();
            
            // calculate backward to identify new weights
            o.backward();
            h.backward();
            i.backward();
            
            

            // update the weigths and set them to the new weights
            o.update();
            h.update();
            i.update();

        }

    }

}
