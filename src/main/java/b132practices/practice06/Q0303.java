package b132practices.practice06;

public class Q0303 {
    //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
    // information of the book
    String bookName;
    String authorName;
    int numOfPages;
    static int numOfBooks;
    String bookId="";

    public static void main(String[] args) {
        Q0303 book1=new Q0303("Sefiller","Victor Hugo",825);
        Q0303 book2=new Q0303("Suc ve Ceza","Dostojevski",225);
        book1.display();
        book2.display();


    }
    Q0303(String bookName,String authorName,int numOfPages){
        this.bookName=bookName;
        this.authorName=authorName;
        this.numOfPages=numOfPages;
        numOfBooks++;
        bookId=bookName.substring(0,2)+numOfBooks;
    }
    public  void display(){
        System.out.println("Book Name: "+bookName+" Author name: "+authorName+" Number of pages: "+numOfPages+" Book Id: "+bookId);
    }

}
