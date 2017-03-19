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
public class InputNode extends Node {

   

    /**
     * call constructor of parent class this is not a good solution because we
     * crate ArrayList objects for no reason
     */
    public InputNode() {         
        super(new ArrayList());
        Log.info("InputNode constructor called");         
    }

   
    
    
    public void calculateForward() {        
       
            Log.info("calculateForward() does nothing because value already set in InputNode");            
        
    }    

}
