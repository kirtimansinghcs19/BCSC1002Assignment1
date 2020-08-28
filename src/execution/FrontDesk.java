/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
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
        Book book = new Book();
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
                    System.out.println( "Enter your roll number : " );
                    int rollNumber = input.nextInt();
                    input.nextLine();
                    System.out.println( "Book Details:" );
                    String bookName = input.nextLine();
                    //   String authorName=input.nextLine();
                    //     String isbnName=input.nextLine();
                    book.setBookName( bookName );
                    student.issueNewBook( bookName, rollNumber );
                    break;
                case RETURN_BOOK:
                    break;
                case LIST_INVENTORY:
                    student.listInventory();
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println( "WRONG CHOICE...." );
            }
        } while (studentInput != 4);
        input.close();
    }
}
