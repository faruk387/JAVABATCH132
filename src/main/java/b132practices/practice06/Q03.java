package b132practices.practice06;

import java.awt.print.Book;

public class Q03 {
    //Type code to add books to library with its info(bookName, authorName, pageNumber), then create a method to show
    // information of the book
    String bookName;
    String authorName;
    int numOfPage;
    static int numOfBooks;
    String bookId="";

    public static void main(String[] args) {
        Q03 book1=new Q03("Crime and Punishment","Dostoevsky",650);
        Q03 book2=new Q03("Thousand Shiny Suns","Khaled Houseyni",276);
        Q03 book3=new Q03("A wild sheep chase","Murakami",756);

        book1.display();
        book2.display();
        book3.display();



    }
    Q03(String bookName,String authorName,int numOfPage){
        this.bookName=bookName;
        this.authorName=authorName;
        this.numOfPage=numOfPage;
        numOfBooks++;
        bookId=bookName.substring(0,2)+numOfBooks;
    }

  public void display(){
      System.out.println("Book name: "+bookName+"Author Name: "+authorName+"Number of page: "+numOfPage+"Book Id: "+bookId);

  }


}
