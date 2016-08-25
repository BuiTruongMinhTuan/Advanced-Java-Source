package chapter1_18;

import java.util.Scanner;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class MainForGiftBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input information of Gift");
            System.out.println("Input shape:");
            String shape = sc.nextLine();
            System.out.println("Input color:");
            String color = sc.nextLine();
            System.out.println("Input name:");
            String name = sc.nextLine();
            System.out.println("Input weight:");
            double weight = sc.nextDouble();

            GiftBox.Gift gift = new GiftBox(shape, color).new Gift(name, weight);
            System.out.println("Information of Gift");
            gift.outputInfoGift();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.toString());
        }
    }
}
