/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_9;

import java.io.IOException;

/**
 *
 * @author long
 */
public class Laptop extends Computer{

    public Laptop() {
    }

    public Laptop(String iD, int prince, String manufacturer, int quantum, String CPU,String RAM) {
        super(iD, prince, manufacturer, quantum);
        this.CPU=CPU;
        this.RAM=RAM;
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("CPU:");
        this.CPU=input.readLine();
        System.out.println("RAM:");
        this.RAM=input.readLine();
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("CPU: " + this.CPU);
        System.out.println("RAM: " + this.RAM);
    }
    
    
    
    
    
}
