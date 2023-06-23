package Java.ClassesObjectsPackages.Book;

public class Book {
    private String BookName;
    private String BookAuthorName;
    private int BookPrice;

    public Book(String Bname,String Aname,int Bprice)
    {
        super();
        this.BookName = Bname;
        this.BookAuthorName = Aname;
        this.BookPrice = Bprice;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getBookAuthorName() {
        return BookAuthorName;
    }
    public void setBookAuthorName(String bookAuthorName) {
        BookAuthorName = bookAuthorName;
    }
    public int getBookPrice() {
        return BookPrice;
    }
    public void setBookPrice(int bookPrice) {
        BookPrice = bookPrice;
    }

    
}
