package Java.Collection_Generics_StreamAPI.Book_Manipulation;


public class book {
    
    private int Bookno;
    private String BookName;
    private String BookAuthorName;

    public book(){

    }
    public book(int bookno,String BookName,String BookAuth) {
        super();
        this.Bookno = bookno;
        this.BookName = BookName;
        this.BookAuthorName = BookAuth;
    }
    public int getBookno() {
        return Bookno;
    }
    public void setBookno(int bookno) {
        Bookno = bookno;
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

}
