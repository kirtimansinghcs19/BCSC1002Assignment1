/*  Created by IntelliJ IDEA.
 *  User: Kirtiman Singh
 *  Date: 26/08/20
 *  Time: 3:57 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private static final int TOTAL_BOOKS_IN_LIBRARY = 20;
    private Book[] booksAvailableInLibrary;

    public Library() {
        this.booksAvailableInLibrary = new Book[TOTAL_BOOKS_IN_LIBRARY];
        for (int i = 0; i < booksAvailableInLibrary.length; i++) {
            booksAvailableInLibrary[i] = new Book();
        }
    }

    public Library(Book[] books) {
        this.booksAvailableInLibrary = books;
    }

    public Book[] getBooksAvailableInLibrary() {
        return booksAvailableInLibrary.clone();
    }

    public void setBooksAvailableInLibrary(Book[] booksAvailableInLibrary) {
        this.booksAvailableInLibrary = booksAvailableInLibrary;
    }

    @Override
    public String toString() {
        return "List of Available Books in library " + Arrays.toString( booksAvailableInLibrary ) + ".";
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
        return Arrays.equals( getBooksAvailableInLibrary(), that.getBooksAvailableInLibrary() );
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode( getBooksAvailableInLibrary() );
    }

    public void listOfBooksInLibrary() {
        booksAvailableInLibrary[0].setBookName( "Java" );
        booksAvailableInLibrary[0].setAuthorName( "intellj" );
        booksAvailableInLibrary[0].setIsbnNumber( "423434343433430" );
        booksAvailableInLibrary[1].setBookName( "Python" );
        booksAvailableInLibrary[1].setAuthorName( "Pycharm" );
        booksAvailableInLibrary[1].setIsbnNumber( "983732632737389" );
        booksAvailableInLibrary[2].setBookName( "Operating System" );
        booksAvailableInLibrary[2].setAuthorName( "Book of rama swami" );
        booksAvailableInLibrary[2].setIsbnNumber( "9232323332233225" );
        booksAvailableInLibrary[3].setBookName( "Fundamental of Software Engineering" );
        booksAvailableInLibrary[3].setAuthorName( "SRE Sawaminath" );
        booksAvailableInLibrary[3].setIsbnNumber( "123456779775556" );
        booksAvailableInLibrary[4].setBookName( "C" );
        booksAvailableInLibrary[4].setAuthorName( "jacky Nath" );
        booksAvailableInLibrary[4].setIsbnNumber( "875478426753561" );
        booksAvailableInLibrary[5].setBookName( "c++" );
        booksAvailableInLibrary[5].setAuthorName( "RK swami" );
        booksAvailableInLibrary[5].setIsbnNumber( "3455465676767700" );
        booksAvailableInLibrary[6].setBookName( "Complete it" );
        booksAvailableInLibrary[6].setAuthorName( "Nirupa rao" );
        booksAvailableInLibrary[6].setIsbnNumber( "12345678903454540" );
        booksAvailableInLibrary[7].setBookName( "The society" );
        booksAvailableInLibrary[7].setAuthorName( "Kirteas sayam" );
        booksAvailableInLibrary[7].setIsbnNumber( "9246853456667" );
        booksAvailableInLibrary[8].setBookName( "Fundamental of Software Engineering" );
        booksAvailableInLibrary[8].setAuthorName( "Radhe sayam" );
        booksAvailableInLibrary[8].setIsbnNumber( "23543243543545428" );
        booksAvailableInLibrary[9].setBookName( "Java" );
        booksAvailableInLibrary[9].setAuthorName( "intellj" );
        booksAvailableInLibrary[9].setIsbnNumber( "423434343433430" );
        booksAvailableInLibrary[10].setBookName( "Python" );
        booksAvailableInLibrary[10].setAuthorName( "Pycharm" );
        booksAvailableInLibrary[10].setIsbnNumber( "983732632737389" );
        booksAvailableInLibrary[12].setBookName( "Operating System" );
        booksAvailableInLibrary[12].setAuthorName( "Book of rama swami" );
        booksAvailableInLibrary[12].setIsbnNumber( "9232323332233225" );
        booksAvailableInLibrary[13].setBookName( "Fundamental of Software Engineering" );
        booksAvailableInLibrary[13].setAuthorName( "SRE Sawaminath" );
        booksAvailableInLibrary[13].setIsbnNumber( "123456779775556" );
        booksAvailableInLibrary[14].setBookName( "C" );
        booksAvailableInLibrary[14].setAuthorName( "jacky Nath" );
        booksAvailableInLibrary[14].setIsbnNumber( "875478426753561" );
        booksAvailableInLibrary[15].setBookName( "c++" );
        booksAvailableInLibrary[15].setAuthorName( "RK swami" );
        booksAvailableInLibrary[15].setIsbnNumber( "3455465676767700" );
        booksAvailableInLibrary[16].setBookName( "Complete it" );
        booksAvailableInLibrary[16].setAuthorName( "Nirupa rao" );
        booksAvailableInLibrary[16].setIsbnNumber( "12345678903454540" );
        booksAvailableInLibrary[17].setBookName( "The society" );
        booksAvailableInLibrary[17].setAuthorName( "Kirteas sayam" );
        booksAvailableInLibrary[17].setIsbnNumber( "9246853456667" );
        booksAvailableInLibrary[18].setBookName( "Fundamental of Software Engineering" );
        booksAvailableInLibrary[18].setAuthorName( "Radhe sayam" );
        booksAvailableInLibrary[18].setIsbnNumber( "23543243543545428" );
        booksAvailableInLibrary[19].setBookName( "Fundamental of Software Engineering" );
        booksAvailableInLibrary[19].setAuthorName( "Radhe sayam" );
        booksAvailableInLibrary[19].setIsbnNumber( "23543243543545428" );
    }

    public void showAvailableBooks() {
        System.out.println( "----------------------Available Books------------------------------------------" );
        System.out.printf( "*%-40s %-25s %-25s*\n", "Book Name", "Author Name", "ISBN Number" );
        System.out.println( "-----------------------------------------------------------------------------------" );
        int index = 0;
        while (index != TOTAL_BOOKS_IN_LIBRARY) {
            System.out.printf( "%-40s %-25s %-25*\n", booksAvailableInLibrary[index].getBookName(), booksAvailableInLibrary[index].getAuthorName(), booksAvailableInLibrary[index].getIsbnNumber() );
            index++;
        }
        System.out.println( "-----------------------------------------------------------------------------------" );
    }
}

