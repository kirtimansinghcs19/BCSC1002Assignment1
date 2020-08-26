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
            books[i] = new Book( "Books " + (i + 1) );
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
}