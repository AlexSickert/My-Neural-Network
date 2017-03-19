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
public class ErrorCalc {
    
    OutputLayer out;
    ArrayList desiredOutput;
    ArrayList errors;
    float toalError;
    
    public void setReferences(OutputLayer o, ArrayList l){
        out = o;
        desiredOutput = l;    
        
    }
    
    public void calculate(){
        Log.info("to do - calcualtion of error");
    // loop through arraylist and calucalte each error individually and combined error
    }
    
    
}
