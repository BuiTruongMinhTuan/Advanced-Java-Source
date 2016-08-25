
package chapter1part1_12;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class TextBook extends Book {

    public TextBook() {
    }

    public TextBook(String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
    }
    int state;

    public TextBook(int state, String id, String name, String date, double price, int amount, String publisher) {
        super(id, name, date, price, amount, publisher);
        this.state = state;
    }

    @Override
    public double calculateMoney() {
        if (state == 1) {
            return super.calculateMoney(); //To change body of generated methods, choose Tools | Templates.
        } else {
            return super.calculateMoney() * .5f;
        }
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("state of Book: (1)new (2)old");
                state = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            if (state != 1 && state != 2) {
                System.out.println("only (1)new (2)old please try gain !");
                continue;
            }
            check = false;
        }
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("state of Book" + ((state == 1) ? "new" : "old"));
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
