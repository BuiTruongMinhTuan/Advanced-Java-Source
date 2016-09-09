package chapter2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @author Bui Truong Minh Tuan
 * Date : 7/9/2016
 * Version : 1.0
 * 
 */
public class ManagementCD {

    public void manager() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            List<CD> list = new ArrayList<>();
            int cont = 1;
            while (cont == 1) {
                System.out.println("Input name of CD: ");
                String nameCD = input.readLine();
                System.out.println("Input name of singer: ");
                String nameSinger = input.readLine();
                System.out.println("Input id of CD: ");
                String id = input.readLine();
                System.out.println("Input price of CD: ");
                double price = Double.parseDouble(input.readLine());
                System.out.println("Input quantity of sing: ");
                int quantity = Integer.parseInt(input.readLine());

                CD cd = new CD(id, nameCD, nameSinger, quantity, price);
                list.add(cd);
                System.out.println("1.Continue");
                System.out.println("2.Exit");
                System.out.println("Please choice 1 or 2");
                int choice = Integer.parseInt(input.readLine());
                if (choice != 1) {
                    cont = 0;
                }

            }

            System.out.println("List before compare: ");
            for (CD cd : list) {
                System.out.println(cd.toString());
            }

            System.out.println("List after compare");
            Collections.sort(list);
            for (CD cd : list) {
                System.out.println(cd.toString());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    
}
