/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public Book() {

    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.authorName = "Dont know";
        this.isbnNumber = "okk";
    }

    public Book(String bookName, String authorName, String ibnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumber = ibnNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return String.format( "Book Name: %s, Author Name: %s, Book ISBN NUMBER: %s", getBookName(), getAuthorName(), getIsbnNumber() );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals( this.getBookName(), book.getBookName() ) &&
                Objects.equals( this.getAuthorName(), book.getAuthorName() ) &&
                Objects.equals( this.getIsbnNumber(), book.getIsbnNumber() );
    }

    @Override
    public int hashCode() {
        return Objects.hash( getBookName(), getAuthorName(), getIsbnNumber() );
    }
}

