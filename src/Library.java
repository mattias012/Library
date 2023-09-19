import java.util.ArrayList;
public class Library extends Main {

    //This is the library
    private Book book;
    String shelf;

    // ArrayList<Book> books = new ArrayList<>();

    public Library(Book book, String shelf){
        //Generate the library. An arraylist of all objects (book)?


    }

    public void addBooksToLibrary(){

        System.out.println("What is the name of the book you wnat to add?");
        String name = scanner.nextLine();
        System.out.println("What is the authors name?");
        String author = scanner.nextLine();
        System.out.println("What year was the book published?");
        String year = scanner.nextLine();
        System.out.println("What edition is it?");
        String edition = scanner.nextLine();

        //Create the book
        Book book = new Book(name, author, year, edition);

        System.out.println("Thanks for adding the following:");
        System.out.println(book);

        //Add it to the "library".
//        books.add(book);

        System.out.println("The book has been added to the library! Thanks for your contribrution");

    }

}
