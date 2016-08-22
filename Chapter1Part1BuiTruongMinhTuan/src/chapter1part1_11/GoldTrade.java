/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_11;

import java.io.IOException;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
enum GoldType {
    TYPE10K(13889000), TYPE14K(19915000), TYPE18K(25978000), TYPE24K(35141000);

    double price;

    GoldType(double price) {
        this.price = price;
    }
}

public class GoldTrade extends Trade {

    public GoldTrade() {
    }

    public GoldTrade(String idTrade, String dateTrade, int numberTrade) {
        super(idTrade, dateTrade, numberTrade);
    }
    int goldType;

    public GoldTrade(int goldType, String idTrade, String dateTrade, int numberTrade) {
        super(idTrade, dateTrade, numberTrade);
        this.goldType = goldType;
    }

    //Calculate the total price of Gold trade
    public double getTotalPrice() {
        double totalPrice = 0;
        switch (goldType) {
            case 1:
                totalPrice = numberTrade * GoldType.TYPE10K.price;
                break;
            case 2:
                totalPrice = numberTrade * GoldType.TYPE14K.price;
                break;
            case 3:
                totalPrice = numberTrade * GoldType.TYPE18K.price;
                break;
            case 4:
                totalPrice = numberTrade * GoldType.TYPE24K.price;
                break;
            default:
                break;
        }
        return totalPrice;
    }

    @Override
    public void outputInfo() {
        super.outputInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Gold type: " + goldType);
        System.out.println("total Price: " + String.format("%.1f", getTotalPrice()));
    }

    @Override
    public void inputInfo() throws IOException {
        super.inputInfo(); //To change body of generated methods, choose Tools | Templates.

        boolean check = true;
        while (check) {
            try {
                System.out.println("Gold type: (1)TYPE10K (2)TYPE14K (3)TYPE18K (4)TYPE24K");
                goldType = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            if (goldType < 1 || goldType > 4) {
                System.out.println("Gold type: (olny 1-4)");
                continue;
            }
            check = false;
        }
    }

    public int getGoldType() {
        return goldType;
    }

    public void setGoldType(int goldType) {
        this.goldType = goldType;
    }

}
