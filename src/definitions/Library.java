/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book( "Books " + (i + 1) );
        }
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public void setStore(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Library that = (Library) obj;
        return Arrays.equals( getBooks(), that.getBooks() );
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode( getBooks() );
    }

    @Override
    public String toString() {
        return Arrays.toString( books );
    }

    public void issuedBook(String bookName) {
        // TODO add the video to the inventory (add it to the array).
        System.out.println( bookName + " book is issued for you." );
    }

    public void returnedBook(String bookName) {
        System.out.println( "Thank you for returning the book " + bookName + "." );
    }

    public void listInventory() {
        for (Book book : books) {
            System.out.println( book );
        }
    }
}
