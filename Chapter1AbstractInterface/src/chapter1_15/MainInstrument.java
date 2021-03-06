/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_15;

import java.util.Scanner;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class MainInstrument {
    private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Input information of Instrument");
			System.out.println("Input name:");
			String name = sc.nextLine();
			System.out.println("Input manufacturer:");
			String manufacturer = sc.nextLine();
			
			String choose = "";
			do {
				System.out.println("1/Stringed Instrument\n2/NonStringed Instrument");
				choose = sc.nextLine();
				
				if(choose.compareTo("1") == 0)
				{
					System.out.println("Input number of wire:");
					int numWire = sc.nextInt();
					StringedInstrument stringedInstrument = new StringedInstrument(name, manufacturer, numWire);
					stringedInstrument.play();
				}
				else if(choose.compareTo("2") == 0)
				{
					System.out.println("Input using:");
					String use = sc.nextLine();
					NonStringedInstrument nonstringedInstrument = new NonStringedInstrument(name, manufacturer, use);
					nonstringedInstrument.play();
				}
				else
				{
					System.out.println("Please just choose (1) or (2)");
					continue;
				}
			} while (choose.compareTo("1") != 0 && choose.compareTo("2") != 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
}
