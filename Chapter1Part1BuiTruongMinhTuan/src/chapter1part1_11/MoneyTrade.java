
package chapter1part1_11;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
enum MoneyType {
    USD(22260), EUR(24976.28), AUD(16747.13);

    double price;

    MoneyType(double price) {
        this.price = price;
    }
}

public class MoneyTrade extends Trade {

    public MoneyTrade() {
    }

    public MoneyTrade(String idTrade, String dateTrade, int numberTrade) {
        super(idTrade, dateTrade, numberTrade);
    }

    int moneyTrade;
    int typeTrade;

    public MoneyTrade(int moneyTrade, int typeTrade, String idTrade, String dateTrade, int numberTrade) {
        super(idTrade, dateTrade, numberTrade);
        this.moneyTrade = moneyTrade;
        this.typeTrade = typeTrade;
    }

    //Calculate the total price of Money trade
    public double getTotalPrice() {
        double totalPrice = 0;
        switch (moneyTrade) {
            case 1:
                if (typeTrade == 1) {
                    totalPrice = numberTrade * MoneyType.USD.price;
                } else if (typeTrade == 2) {
                    totalPrice = numberTrade * MoneyType.USD.price + (numberTrade * MoneyType.USD.price) * 0.01;
                }
                break;
            case 2:
                if (typeTrade == 1) {
                    totalPrice = numberTrade * MoneyType.EUR.price;
                } else if (typeTrade == 2) {
                    totalPrice = numberTrade * MoneyType.EUR.price + (numberTrade * MoneyType.EUR.price) * 0.01;
                }
                break;
            case 3:
                if (typeTrade == 1) {
                    totalPrice = numberTrade * MoneyType.AUD.price;
                } else if (typeTrade == 2) {
                    totalPrice = numberTrade * MoneyType.AUD.price + (numberTrade * MoneyType.AUD.price) * 0.01;
                }
                break;
            default:
                break;
        }
        return totalPrice;
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("total Price: " + String.format("%.1f", getTotalPrice()));
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.
        boolean check = true;
        while (check) {
            try {
                System.out.println("Money type: (1)USA (2)EUR (3)AUD ");
                moneyTrade = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            if (moneyTrade < 1 || moneyTrade > 3) {
                System.out.println("Gold type: (olny 1-3)");
                continue;
            }
            check = false;
        }
        
        check = true;
        while (check) {
            try {
                System.out.println("type Trade: (1)Buy (2)Sell  ");
                typeTrade = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            if (typeTrade !=1 && typeTrade !=2) {
                System.out.println("type Trade: (olny 1 or 2)");
                continue;
            }
            check = false;
        }
    }

    public int getMoneyTrade() {
        return moneyTrade;
    }

    public void setMoneyTrade(int moneyTrade) {
        this.moneyTrade = moneyTrade;
    }

    public int getTypeTrade() {
        return typeTrade;
    }

    public void setTypeTrade(int typeTrade) {
        this.typeTrade = typeTrade;
    }
    
    
}
