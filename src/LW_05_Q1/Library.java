package LW_05_Q1;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> BorrowableItemsList=new ArrayList<>();



    public void addLibraryItems(Book BorrowableItems) {
        BorrowableItemsList.add(BorrowableItems);
    }

    public void checkOutBorrowableItems(String title) {
        for (Book book: BorrowableItemsList) {
            book.getTitle().equals(title);
            if (book.getTitle().equals(title) && book.isAvailable()) {
                System.out.println("The book you searched is available");
                System.out.println("Checkinh out : "+book.getTitle());
                book.isAvailable();
            }else{
                System.out.println("The book is not available");
            }
        }
    }

    public void ListAllBorrowableItems() {
        System.out.println("Available Books : ");
        for (Book book: BorrowableItemsList){
            if(book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayInformation() {
        int bookCount=0;
        for (Book book: BorrowableItemsList){
            if (book.isAvailable()){
                bookCount++;
            }
        }
        System.out.println("The number of Books are : "+bookCount);
    }
}
