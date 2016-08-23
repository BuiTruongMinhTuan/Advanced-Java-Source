/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_15;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class NonStringedInstrument extends Instrument {

    public NonStringedInstrument() {
        super();
    }
    
    NonStringedInstrument(String name, String manufacturer, String howUse) {
        this.nameInstrument = name;
        this.manufacturer = manufacturer;
        this.howUse = howUse;
    } 
    String howUse;

    @Override
    void play() {
        System.out.println("Input how play?");
        try {
            howUse = input.readLine();
        } catch (IOException ex) {
            Logger.getLogger(NonStringedInstrument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
