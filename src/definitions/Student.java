/*  Created by IntelliJ IDEA.
 *  User: Kirtiman singh
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private static final int MAXIMUM_BOOKS_STUDENT_CAN_ISSUE = 3;
    private Book[] booksNameIssuedByStudent;
    private String firstName;
    private String lastName;
    private long rollNumber;
    private int numberOfBookIssued;

    public Student() {
        this.firstName = "Kirtiman";
        this.lastName = " Singh";
        this.rollNumber = 101500400;
        this.numberOfBookIssued = 0;
        this.booksNameIssuedByStudent = new Book[MAXIMUM_BOOKS_STUDENT_CAN_ISSUE];
        for (int i = 0; i < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; i++) {
            booksNameIssuedByStudent[i] = new Book();
        }
    }

    public Student(String firstName, String lastName, long rollNumber, int numberOfBookIssued, Book[] booksNameIssuedByStudent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.numberOfBookIssued = numberOfBookIssued;
        this.booksNameIssuedByStudent = booksNameIssuedByStudent;
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
        return numberOfBookIssued;
    }

    public void setNumberOfBookIssued(int numberOfBookIssued) {
        this.numberOfBookIssued = numberOfBookIssued;
    }

    public Book[] getBooksNameIssuedByStudent() {
        return booksNameIssuedByStudent.clone();
    }

    public void setBooksNameIssuedByStudent(Book[] booksNameIssuedByStudent) {
        this.booksNameIssuedByStudent = booksNameIssuedByStudent;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean returnBook(String bookName) {
        boolean returnBook = false;
        int returnBookIndex = 0;
        for (int index = 0; index < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; index++) {
            if (bookName.equals( booksNameIssuedByStudent[index].getBookName() )) {
                returnBook = true;
                returnBookIndex = index;
                setNumberOfBookIssued( getNumberBookIssued() - 1 );
                break;
            }
        }
        if (returnBook) {
            booksNameIssuedByStudent[returnBookIndex].setBookName( null );
        } else {
            System.out.println( "Please Enter the correct book name." );
        }
        return returnBook;
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
                Arrays.equals( this.getBooksNameIssuedByStudent(), o1.getBooksNameIssuedByStudent() );
    }

    public int hashCode() {
        return Objects.hash( getName(), getNumberBookIssued(), getRollNumber() ) + Arrays.hashCode( getBooksNameIssuedByStudent() );
    }

    @Override
    public String toString() {
        return Arrays.toString( booksNameIssuedByStudent ) + String.format( "Book Name: %s, Author Name: %s, Book ISBN NUMBER: %s", getName(), getRollNumber(), getNumberBookIssued() );
    }

    public void showIssuedBooksByStudent() {
        if (numberOfBookIssued == 0) {
            System.out.println( "Sorry, No book issued yet." );
        } else {
            System.out.println( "List of Books : " );
            for (int index = 0; index < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; index++) {
                if (booksNameIssuedByStudent[index].getBookName() != null) {
                    System.out.print( booksNameIssuedByStudent[index].getBookName() + (index < getNumberBookIssued() - 1 ? ", " : ".\n") );
                }
            }
        }
    }

    public void issuedBooksToStudents(int index, String bookName) {
        booksNameIssuedByStudent[index].setBookName( bookName );
    }
}