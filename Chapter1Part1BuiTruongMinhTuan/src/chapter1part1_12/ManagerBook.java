/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1part1_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author BTMT
 * @Date 20/08/2016
 * @version 1.0
 */
public class ManagerBook {

    ArrayList<TextBook> ListTextBooks;
    ArrayList<ReferenceBook> ListReferenceBooks;
    TextBook textBook;
    ReferenceBook referenceBook;

    public ManagerBook() {
        ListTextBooks = new ArrayList<>();
        ListReferenceBooks = new ArrayList<>();
    }

    int chosen = 0;
    double sumTextBook = 0;
    double sumReferenceBook = 0;

    //Manager Book
    public void manager() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==Book Managerment Program ==");
        while (true) {
            boolean check = true;
            while (check) {
                System.out.println("Choose kind Book TextBook(1)/ Reference Books(2)");
                chosen = Integer.parseInt(input.readLine());
                if (chosen == 1) {
                    textBook = new TextBook();
                    textBook.inputInfo();
                    ListTextBooks.add(textBook);
                    sumTextBook += textBook.calculateMoney();
                } else if (chosen == 2) {
                    referenceBook = new ReferenceBook();
                    referenceBook.inputInfo();
                    ListReferenceBooks.add(referenceBook);
                    sumReferenceBook += referenceBook.calculateMoney();
                }
                if (chosen != 1 && chosen != 2) {
                    System.out.println("only Chosen 1 or 2 please try agian!");
                    continue;
                }

                check = false;
            }
            System.out.println("Just added your Book into to the Collection");
            System.out.print("Do you want to add Book into to Collection (y/n) continue? ");
            String answer = input.readLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("-----------------");
                continue;
            }
            System.out.println("-----------------");
            System.out.println("Information of teacher kind Desktop: ");
            for (TextBook textBook : ListTextBooks) {

                textBook.outputInfo();
                System.out.println("*****");
            }
            System.out.println("-----------------");
            System.out.println("Information of student kind Laptop: ");
            for (ReferenceBook referenceBookstudent : ListReferenceBooks) {

                referenceBookstudent.outputInfo();
                System.out.println("*****");
            }
            if (ListTextBooks.size() != 0) {
                System.out.println(String.format("Total Price Text Books: %.1f", sumTextBook));
            }
            if (ListReferenceBooks.size() != 0) {
                System.out.println(String.format("Total Price Reference Books: %.1f", sumReferenceBook));
                double averagePriceReferenceBooks = sumReferenceBook / ListReferenceBooks.size();
                System.out.println(String.format("Average Price Reference Books: %.1f", averagePriceReferenceBooks));
            }
            System.exit(0);
        }
    }
}
