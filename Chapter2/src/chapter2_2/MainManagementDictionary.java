package chapter2_2;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.TreeMap;

public class MainManagementDictionary {
    public void manager(){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			Dictionary dic = new Dictionary(new TreeMap<String, String>());
			int cont = 1;
			String key = "";
			String value = "";
			while(cont == 1){
				System.out.println("1.Add new item into dictionary");
				System.out.println("2.Search item");
				System.out.println("3.View all item");
				System.out.println("4.Exit");
				System.out.println("Please choice 1 or 2 or 3 or 4");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
					case 1:
						System.out.println("Input key: ");
						key = input.readLine();
						System.out.println("Input value: ");
						value = input.readLine();
						if(dic.checkDuplicate(key))
							System.out.println("This word already exists");
						else
							dic.addNewItem(key, value);
						break;
					case 2:
						System.out.println("Input key: ");
						key = input.readLine();
						System.out.println("result: " + dic.getValue(key));
						break;
					case 3:
						dic.displayAllItem();
						break;
					case 4:
						cont = 0;
						break;
					default:
						System.out.println("Please choice 1 or 2 or 3 or 4");
				}
			}
			
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
    }
	
}
