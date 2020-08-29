/*  Created by IntelliJ IDEA.
 *  User: Kirtiman Singh
 *  Date: 26/08/20
 *  Time: 3:52 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_INVENTORY = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int studentInput;
        Student student = new Student();
        Library library = new Library();
        String bookName;
        library.listOfBooksInLibrary();
        do {
            System.out.println( "-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-" );
            System.out.println( "How may I help you today?" );
            System.out.println( "1. Issue a new book for me." );
            System.out.println( "2. Return a previously issues book for me." );
            System.out.println( "3. Show me all my issues books." );
            System.out.println( "4. Exit: " );
            System.out.println( "Enter you choice (1..4): " );
            studentInput = input.nextInt();
            switch (studentInput) {
                case ISSUE_BOOK:
                    input.nextLine();
                    System.out.println( "Enter first name and last name:" );
                    student.setName( input.nextLine(), input.nextLine() );
                    System.out.println( "Enter roll number: " );
                    student.setRollNumber( input.nextLong() );
                    System.out.println( "Number of books you want to issue: " );
                    int numberOfBook = input.nextInt();
                    if (numberOfBook <= 3)
                        student.setNumberOfBookIssued( numberOfBook );
                    else {
                        System.out.println( "You can issue more than 3 Books" );
                        break;
                    }
                    System.out.println( "These are the available books: " );
                    library.showAvailableBooks();
                    input.nextLine();
                    System.out.println( "Enter the details of the books: " );
                    for (int index = 0; index < student.getNumberBookIssued(); index++) {
                        System.out.println( "Enter name of book " + (index + 1) + "==Q " );
                        bookName = input.nextLine();
                        student.issuedBooksToStudents( index, bookName );
                    }
                    System.out.println( "Thank you for Issuing the Books.." );
                    break;
                case RETURN_BOOK:
                    System.out.println( "Enter the name of the book you want to return: " );
                    input.nextLine();
                    bookName = input.nextLine();
                    if (student.returnBook( bookName )) {
                        System.out.println( "Thank you for returning the book " + bookName + "." );
                    }
                    break;
                case LIST_INVENTORY:
                    student.showIssuedBooksByStudent();
                    break;
                case EXIT:
                    System.out.println( "------------------Thanks you----------------" );
                    break;
                default:
                    System.out.println( "WRONG CHOICE...." );
            }
        } while (studentInput != 4);
        input.close();
    }
}
