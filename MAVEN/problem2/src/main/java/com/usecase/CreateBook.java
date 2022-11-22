package com.usecase;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.model.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book name: ");
        String name = sc.next();
        System.out.println("Enter the book author: ");
        String author = sc.next();
        System.out.println("Enter the book publication: ");
        String publication = sc.next();
        System.out.println("Enter the category: ");
        String category = sc.next();
        System.out.println("Enter the pages: ");
        int pages = sc.nextInt();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();
        System.out.println("Enter the created_timestamp: ");
//        Date create_date = sc.next();
        sc.nextLine();
        String create_date = sc.nextLine();
        Date date1;
        try {
            date1 = new SimpleDateFormat("dd-MM-yyyy").parse(create_date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Book book = new Book(name, author, publication, category, pages, price, date1);

        BookDao dao = new BookDaoImpl();
        dao.CreateBook(book);
    }
}
