package chapter1_28;

import java.util.Scanner;
/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class MainforObserver {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		account.setState(10000000);
		@SuppressWarnings("unused")
		EmailObserver emailOb = new EmailObserver(account);
		@SuppressWarnings("unused")
		MobiObserver mobiOb = new MobiObserver(account);

		System.out.println("Enter the amount you want to withdraw: ");
		double state = input.nextDouble();
		if (state > account.getState()) {
			System.out.println("This amount is greater than the amount in your account.");
		} else {
			account.setState((account.getState() - state));
			account.notifyAllObservers();
		}

	}

}
