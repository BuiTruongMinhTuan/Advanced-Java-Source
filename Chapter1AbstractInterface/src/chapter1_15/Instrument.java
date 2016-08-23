/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
abstract class Instrument {
    String nameInstrument;
    String manufacturer;
    BufferedReader input;

    public Instrument() {
        input=new BufferedReader(new InputStreamReader(System.in));
    }
    
    
    abstract void play();

    public String getNameInstrument() {
        return nameInstrument;
    }

    public void setNameInstrument(String nameInstrument) {
        this.nameInstrument = nameInstrument;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
}
