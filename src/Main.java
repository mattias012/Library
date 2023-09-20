import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static Library library = new Library();

    public static void main(String[] args) {


        //My Library
        //Set menu choice and display menu.
        int menuChoice;
        boolean continueProgram = true;

        while (continueProgram){
            menuChoice = menu();
            if (menuChoice == 1){
                //Run method to create book and add it to the library.
                library.addBooksToLibrary();
            }
            else if (menuChoice == 2){
                //Run method to search for a book.
                library.searchBook();
            }
            else if (menuChoice == 3){
                library.listAllAvailableBooks();
            }
            else if (menuChoice == 4){
                library.returnBooks();
            }
            else if (menuChoice == 5){

                continueProgram = false;
                System.out.println("Programmet avslutades");
            }
            else {
                menuChoice = menu();
            }
        }
    }
    //Simple menu choice
    static int menu() {

        //set menuChoice;
        int menuChoice = 0;

        System.out.println();
        System.out.println("------------------------------\n" +
                "1. Add a book to the library \n" +
                "2. Search for a book by name \n" +
                "3. List all available books \n" +
                "4. Return a book \n" +
                "5. Quit\n" +
                 "------------------------------\n"   );

        String choice = scanner.nextLine();

        //Check input, display message if not ok choice
        if (checkIfnumber(choice)) {
            menuChoice = Integer.parseInt(choice);

            if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3) {
                menuChoice = Integer.parseInt(choice);
            }
        }
        return menuChoice;
    }

    static boolean checkIfnumber(String input) {

        //Check if string is only digits
        if (!input.matches("\\d*")) {
            return false;
        } else {
            return true;
        }
    }

}