package chapter1_27;

import java.util.Scanner;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class MainforShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(drawShape());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//show option for choice
	private static int menu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("-----Shape menu------");
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		int temp = 0;
		while (temp < 1 || temp > 2) {
			System.out.println("Enter a choosen 1 or 2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	
	private static int decorationMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("-----Decoration menu------");
		System.out.println("1. Normal Border");
		System.out.println("2. Red Border");
		int temp = 0;
		while (temp < 1 || temp > 2) {
			System.out.println("Enter a choosen 1 or 2: ");
			temp = input.nextInt();
		}
		return temp;
	}
	
	private static IShape chooseShape() {
		switch (menu()) {
		case 1:
			return new Circle();
		case 2:
			return new Rectangle();
		default:
			break;
		}
		return null;
	}
	
	private static String drawShape() {
		String temp = " ";
		IShape iShape = chooseShape();
		switch (decorationMenu()) {
		case 1:
			NormalShapeDecorator normal = new NormalShapeDecorator(iShape);
			temp = normal.draw();
			break;
		case 2:
			RedShapeDecorator red = new RedShapeDecorator(iShape);
			temp = red.draw();
			break;
		default:
			break;
		}
		return temp;
	}
}
