
package chapter1part1_9;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class Desktop extends Computer{

    public Desktop() {
    }

    public Desktop(String iD, int prince, String manufacturer, int quantum,int weight,int timeOfCell,int screenSize) {
        super(iD, prince, manufacturer, quantum);
        this.weight=weight;
        this.timeOfCell=timeOfCell;
        this.screenSize=screenSize;
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("weight:");
                weight = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
        
        check = true;
        while (check) {
            try {
                System.out.println("timeOfCell:");
                timeOfCell = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
         check = true;
        while (check) {
            try {
                System.out.println("screenSize:");
                screenSize = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("weight: " + weight);
        System.out.println("timeOfCell: " + timeOfCell);
        System.out.println("screenSize: " + screenSize);
    }
   
}
