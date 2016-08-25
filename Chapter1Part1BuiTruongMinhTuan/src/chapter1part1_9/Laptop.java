
package chapter1part1_9;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
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
