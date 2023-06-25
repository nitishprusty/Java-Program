package Java.Collection_Generics_StreamAPI.Book_Manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
  
        while (true) {
            System.out.println("Enter 1. For Add Book");
            System.out.println("2.For Display all Books");
            System.out.println("3.Display Books of Particular Author Name");
            System.out.println("4.Count the Total Number of books of a given book Name");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Book No.");
                int bno = sc.nextInt();
                System.out.println("Enter Book Name");
                String BookName = sc.next();
                System.out.println("Enter Book Author Name");
                String authorName = sc.next();

                book obj = new book(bno, BookName, authorName);
                library.AddBook(obj);
            } else if (choice == 2) {

                ArrayList<book> books = library.getAllbooks();

                if (library.isEmpty()) {
                    System.out.println("No Books Available");
                }

                for (book b : books) {
                    System.out.println("Book Number " + b.getBookno());
                    System.out.println("Book Names " + b.getBookName());
                    System.out.println("Book AuthorName " + b.getBookAuthorName());
                }

            } else if (choice == 3) {

                System.out.println("Enter the Author Name");
                String authorName = sc.next();
                ArrayList<book> bAuth = library.getAuthorName(authorName);

                if (bAuth.isEmpty()) {
                    System.out.println("None of the books published by " + authorName);
                } else {
                    for (book b : bAuth) {
                        System.out.println("Book Number " + b.getBookno());
                        System.out.println("Book Names " + b.getBookName());
                        System.out.println("Book AuthorName " + b.getBookAuthorName());
                    }
                }

            } else if (choice == 4) {

                System.out.println("Enter Book Name");
                String bname = sc.next();
                int cnt = library.countBooks(bname);

                System.out.println("Total Number of books of " + bname + "is " + cnt);

            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice entered");
            }
        }
        sc.close();
    }
}
