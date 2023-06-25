package Java.Collection_Generics_StreamAPI.Book_Manipulation;

import java.util.ArrayList;

public class Library {

    private ArrayList<book> booklist = new ArrayList<>();

    public void AddBook(book obj){
        booklist.add(obj);
    }
    
    public void setBookList(ArrayList<book> blist){
         this.booklist = blist;
    }

    public ArrayList<book> getBooklist(){
        return booklist;
    }

    public boolean isEmpty(){
        boolean flag = false;
        if(booklist.isEmpty()){
            flag = true;
        }
        return flag;
    }


    public ArrayList<book> getAuthorName(String aname) {

        ArrayList<book> a1 = new ArrayList<>();
        for(int i = 0;i<this.booklist.size();i++){
            if(this.booklist.get(i).getBookAuthorName().equalsIgnoreCase(aname)) {
                 a1.add(booklist.get(i));
            }
        }
        return a1;
    }

    public ArrayList<book> getAllbooks(){
        return this.booklist;
    }

    public int countBooks(String bname) {
        int cnt = 0;
        for(int i = 0;i<this.booklist.size();i++) {
            if(booklist.get(i).getBookName().equalsIgnoreCase(bname)) {
                cnt++;
            }
        }

        return cnt;
    }
    
}
