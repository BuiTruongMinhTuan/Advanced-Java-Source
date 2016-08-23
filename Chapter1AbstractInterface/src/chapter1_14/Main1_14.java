/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1_14;

import java.util.Scanner;

/**
 *
 * @author Bui Truong Minh Tuan
 * @Date 23/08/2016
 * @version 1.0
 */
public class Main1_14 {

   private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int choose = 0;
			do {
                System.out.println("Please chonsen 1 - 3:");
				System.out.println("1/Circle\n2/Rectangle\n3/Square");
				choose = sc.nextInt();
				
				if(choose == 1)
				{
					Circle circle = new Circle();
					circle.setRadian(3);
					System.out.println("Perimeter of Circle: " + circle.perimeter());
					System.out.println("Area of Circle: " + circle.area());
				}
				else if(choose == 2)
				{
					Rectangle rectangle = new Rectangle();
					rectangle.setLeght(5);
					rectangle.setWidth(4);
					System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
					System.out.println("Area of Rectangle: " + rectangle.area());
				}
				else if(choose == 3)
				{
					Square square = new Square();
					square.setWidth(6);
					System.out.println("Perimeter of Square: " + square.perimeter());
					System.out.println("Area of Square: " + square.area());
				}
				else
				{
					System.out.println("Only Please just choose 1 to 3");
					continue;
				}
			} while (choose != 1 && choose != 2 && choose != 3);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.toString());
		}
	}
    
}
