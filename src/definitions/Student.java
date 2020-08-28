/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private Book[] books;
    private String firstName;
    private String lastName;
    private long rollNumber;
    private int numberBookIssued;
    Book book = new Book();
    public Student(String firstName, String lastName, long rollNumber, int numberBookIssued, Book[] books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.numberBookIssued = numberBookIssued;
        this.books = books;
    }

    public Student() {
        this.books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            String a = "sd";
            String b = "dfdf";
            String c = "sdfd";
            // books[i] = new Book(a, b, c);
            books[i] = new Book( a );
        }
    }

    public String getName() {
        return firstName + lastName;
    }

    public long getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(long rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getNumberBookIssued() {
        return numberBookIssued;
    }

    public void setNumberBookIssued(int numberBookIssued) {
        this.numberBookIssued = numberBookIssued;
    }

    public Book[] getBooks() {
        return books.clone();
    }

    public void setStore(Book[] books) {
        this.books = books;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student o1 = (Student) o;
        return this.getRollNumber() == o1.getRollNumber() &&
                this.getNumberBookIssued() == o1.getNumberBookIssued() &&
                Objects.equals( this.getName(), o1.getName() ) &&
                Arrays.equals( getBooks(), o1.getBooks() );
    }

    public int hashCode() {
        return Objects.hash( getName(), getNumberBookIssued(), getRollNumber() ) + Arrays.hashCode( getBooks() );
    }

    @Override
    public String toString() {
        return Arrays.toString( books ) + String.format( "Book Name: %s, Author Name: %s, Book ISBN NUMBER: %s", getName(), getRollNumber(), getNumberBookIssued() );
    }

    public void issueNewBook(String bookName, int rollNumber) {
        boolean available = false;
        int c = 0;
        String b = book.getBookName();
        //  for (int i = 0; i < books.length; i++) {
        if (b.equals( bookName )) {
            available = true;

        }
        // else
        //         available=false;
        //   }
        if (available) {
            System.out.println( "Congratulation, Book is issued to you." );
        } else {
            System.out.println( b );
            System.out.println( bookName );
            System.out.println( "Sorry ,Someone already issued the book" );
        }
    }

    public void listInventory() {
        for (Book book : books) {
            System.out.println( book );
        }
    }
}