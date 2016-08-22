/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BTMT
 * @Date 22/08/2016
 * @version 1.0
 */
public class Trade {
    String idTrade;
	String dateTrade;
	int numberTrade;
    BufferedReader input;
    public Trade() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public Trade(String idTrade, String dateTrade, int numberTrade) {
        this.idTrade = idTrade;
        this.dateTrade = dateTrade;
        this.numberTrade = numberTrade;
    }
    
    public void inputInfo() throws IOException {

        System.out.println("Trade ID:");
        idTrade = input.readLine();
        System.out.println("Trade Date:");
        dateTrade = input.readLine();
        boolean check = true;
        while (check) {
            try {
                System.out.println("number of Trade:");
                numberTrade = Integer.parseInt(input.readLine());
            } catch (NumberFormatException | NullPointerException ex) {
                System.out.println(ex.toString());
                continue;
            }
            check = false;
        }
    }
    
    public void outputInfo() {
        System.out.println("Trade ID: " + idTrade);
        System.out.println("Trade Date: " + dateTrade);
        System.out.println("number of Trade: " + numberTrade);
        
    }

    public String getIdTrade() {
        return idTrade;
    }

    public void setIdTrade(String idTrade) {
        this.idTrade = idTrade;
    }

    public String getDateTrade() {
        return dateTrade;
    }

    public void setDateTrade(String dateTrade) {
        this.dateTrade = dateTrade;
    }

    public int getNumberTrade() {
        return numberTrade;
    }

    public void setNumberTrade(int numberTrade) {
        this.numberTrade = numberTrade;
    }
    
    
}
