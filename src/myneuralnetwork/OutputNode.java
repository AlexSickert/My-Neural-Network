/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myneuralnetwork;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alex
 */
public class OutputNode extends Node {
    
//    ArrayList weights;

    // call construcor of parent class
    public OutputNode(ArrayList nodeReference) {        
        super(nodeReference);
        Log.info("OutputNode constructor called");  

    }

}
