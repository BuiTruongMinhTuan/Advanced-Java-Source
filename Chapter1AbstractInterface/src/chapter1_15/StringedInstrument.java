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
public class StringedInstrument extends Instrument {

    int numOfStrings;

    public StringedInstrument() {
        super();
    }

    StringedInstrument(String name, String manufacturer, int numWire) {
        this.nameInstrument = name;
        this.manufacturer = manufacturer;
        this.numOfStrings = numWire;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    void play() {
        System.out.println("Input number of Strings:");
        try {
            numOfStrings = Integer.parseInt(input.readLine());
        } catch (IOException ex) {
            Logger.getLogger(StringedInstrument.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Name " + nameInstrument + " number of Strings: " + numOfStrings);
    }

}
