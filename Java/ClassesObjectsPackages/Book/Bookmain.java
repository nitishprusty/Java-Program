package Java.ClassesObjectsPackages.Book;

import java.util.Scanner;

public class Bookmain {
    public static void main(String[] args) {
        Book obj = getBookdetails();
        System.out.println("Book Details are : - ");
        System.out.println(obj.getBookName());
        System.out.println(obj.getBookAuthorName());
        System.out.println(obj.getBookPrice());
    }
    static Book getBookdetails(){
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter Book Name");
            String BookName = sc.next();
            System.out.println("Enter Book Author Name");
            String AuthorName = sc.next();
            System.out.println("Enter Book Price");
            int price = sc.nextInt();

            return new Book(BookName, AuthorName, price);
        }
    }
}
