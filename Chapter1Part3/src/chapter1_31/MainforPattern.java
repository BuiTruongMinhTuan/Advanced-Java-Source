package chapter1_31;

import java.util.Scanner;

/**
 * @author Bui Truong Minh Tuan
 * @Date 05/09/2016
 * @version 1.0
 */
public class MainforPattern {

public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	try {
		int type = 0; 
		while(type < 1 || type > 3){
            System.out.print("-----------------------------------");
			System.out.print("\n Enter AoDai type: \n\t1. Traditional\n\t2. Stylize\n\t3. Modern\nSelect: ");
			type = input.nextInt();
		}
		FactoryPattern fp = new FactoryPattern();
		Factory factory = fp.getFactory(type);
		factory.chooseFactory().sew();
        System.out.print("-----------------------------------");
	} catch (Exception e) {
		System.out.println(e.getMessage());
}
}

}