/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ManagerTrade {

    ArrayList<GoldTrade> ListGoldTrade;
    ArrayList<MoneyTrade> ListMoneyTrade;
    MoneyTrade moneyTrade;
    GoldTrade goldTrade;

    public ManagerTrade() {
        ListGoldTrade = new ArrayList<>();
        ListMoneyTrade = new ArrayList<>();

    }

    int chosen = 0;
    double averagePriceGold = 0;
    double averagePriceMoney = 0;
    double sumGold = 0;
    double sumMoney = 0;

    //Manager Trade
    public void manager() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("== Managerment Trading Program ==");

        while (true) {
            try {
                boolean check = true;
                while (check) {
                    System.out.println("Choose kind Trade Gold(1)/ Money(2)");
                    chosen = Integer.parseInt(input.readLine());
                    if (chosen == 1) {
                        goldTrade = new GoldTrade();
                        goldTrade.inputInfo();
                        ListGoldTrade.add(goldTrade);
                        sumGold += goldTrade.getTotalPrice();
                    } else if (chosen == 2) {
                        moneyTrade = new MoneyTrade();
                        moneyTrade.inputInfo();
                        ListMoneyTrade.add(moneyTrade);
                        sumMoney += moneyTrade.getTotalPrice();
                    }
                    if (chosen != 1 && chosen != 2) {
                        System.out.println("only Chosen 1 or 2 please try agian!");
                        continue;
                    }

                    check = false;

                }
                System.out.println("Just added your Trade into to the Collection");
                System.out.print("Do you want to add Trade into to Collection (y/n) continue? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("-----------------");
                    continue;
                }
                System.out.println("-----------------");
                System.out.println("Information of Gold Trade: ");
                for (GoldTrade goldTrade : ListGoldTrade) {
                    
                    goldTrade.outputInfo();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                System.out.println("Information of Money Trade: ");
                for (MoneyTrade moneyTrade : ListMoneyTrade) {
                    
                    moneyTrade.outputInfo();
                    System.out.println("*****");
                }
                System.out.println("-----------------");
                if (ListGoldTrade.size() != 0) {
                    averagePriceGold = sumGold / ListGoldTrade.size();
                    System.out.println(String.format("Average of Gold Trade: %.2f", averagePriceGold));
                }
                if (ListMoneyTrade.size() != 0) {
                    averagePriceMoney = sumMoney / ListMoneyTrade.size();
                    System.out.println(String.format("Average of Money Trade: %.2f", averagePriceMoney));
                }
                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                continue;
            }
        }

    }
}
