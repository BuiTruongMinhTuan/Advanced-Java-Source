package chapter1_19;
/**
 * @author BuiTruongMinhTuan
 * @version 1.0
 * @created 29-Aug-2016 8:28:11 AM
 * Class for Product
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class MainShop {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customers = new ArrayList<Customer>(5);
		ArrayList<Product> product = new ArrayList<Product>(5);
		ArrayList<OrderDetail> orderDetail = new ArrayList<OrderDetail>(5);
		String[] state = {"vua moi dat", "da thanh toan", "da nhan hang"};
		
		customers.add(new Customer("address1", "email1", 1, "name1", "phone1", "1"));
		
		product.add(new Product("Apple", 10000));
		product.add(new Product("Orange", 20000));
		product.add(new Product("Banana", 30000));
		product.add(new Product("Cherry", 40000));
		product.add(new Product("Lemon", 50000));
		
		orderDetail.add(new OrderDetail(1));
		orderDetail.add(new OrderDetail(2));
		orderDetail.add(new OrderDetail(3));
		orderDetail.add(new OrderDetail(4));
		orderDetail.add(new OrderDetail(5));
		
		Order order = new Order(true, new Date(2020,12,19), state[1]);
		
		System.out.println("---Customer Information---");
		for (Customer cus : customers) {
			System.out.println("Customer ID: " + cus.getCustomerID());
			System.out.println("Name: " + cus.getName());
			System.out.println("Indentity Card Number: " + cus.getIndentityCardNumber());
			System.out.println("Phone Number: " + cus.getPhoneNumber());
			System.out.println("Email: " + cus.getEmail());
			System.out.println("Address: " + cus.getAddress());
		}
		
		System.out.println("---Order Information---");
		System.out.println("STT\tProduct Name\tPrice\t  Number  Total Product Price");
		for (int i = 0; i < orderDetail.size(); i++) {
			System.out.println(i + 1 + "\t" + product.get(i).getName() + "\t\t" + product.get(i).getPrice() 
					+ "\t  " + orderDetail.get(i).getNumber() + "\t  " + orderDetail.get(i).getTotalOrderDetailPrice(product.get(i).getPrice()));
		}
	
		System.out.println("Total\t\t\t\t\t  " + order.getTotalOrderPrice(orderDetail, product));
	}

}
