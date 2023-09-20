import java.util.ArrayList;
public class Library extends Main {

    //This is the library
    private Book book;
    ArrayList<Book> books = new ArrayList<>();

    public Library(){
        //Generate the library
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
        books.add(book);

        System.out.println("The book has been added to the library! Thanks for your contribrution");

    }

    public Book getBook(){
        return this.book;
    }
    public void reserveBook(String name){

        if(!name.isEmpty()) {
            for (Book book : books) {
                if (book.getName().contains(name)) {
                    book.setisAvailable(false);
                    System.out.println(book);
                }
            }
        }
        else {
            System.out.println("The book does not exists in our library");
        }
    }
    public void searchBook(){

        String nameOfTheBook;
        System.out.println("Do you know what you're looking for? Y/N");
        String choice = scanner.nextLine();

        if (choice.equals("y")){
            System.out.println("What is the name of the book?");
            nameOfTheBook = scanner.nextLine();

            //Exact match...
            for (Book book : books){
                if(book.getName().equals(nameOfTheBook)){
                    System.out.println("We found " + nameOfTheBook);
                    System.out.println("Do you want to loan it? Y/N?");
                    choice = scanner.nextLine();

                    if (choice.equals("y")){
                        //reserv the book
                        book.getName();
                        reserveBook(book.getName()); //send name of book to reserveBook method
                    }
                }
            }
        } else {
            //list all available books
            listAllBooks();;
        }



    }

    public void listAllBooks(){
        int i = 0;
        for (Book book : books){
            if (book.getIsAvailable()) {
                i++;
                System.out.println(i + ". " + book.getName() + " by " + book.getAuthor());
            }
        }
        System.out.println("");

    }

}
