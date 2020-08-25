/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String isbnNumber;

    public Book() {
        this.bookName = "";
        this.authorName = "";
        this.isbnNumber = "";
    }

    public Book(String bookName, String authorName, String isbnNumber) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
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

    private void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String toString() {
        return String.format( "Book Name: %s, Author Name: %s, Book ISBN NUMBER: %s", getBookName(), getAuthorName(), getIsbnNumber() );
    }
}
