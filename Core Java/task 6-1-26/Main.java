import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    boolean isIssued;

    Book(int id, String name) {
        bookId = id;
        bookName = name;
        isIssued = false;
    }

    void displayBook() {
        System.out.println(bookId + "\t" + bookName + "\t" + (isIssued ? "Issued" : "Available"));
    }
}

class Library {
    Book[] books = new Book[50];
    int count = 0;

    void addBook(int id, String name) {
        books[count++] = new Book(id, name);
        System.out.println("Book Added Successfully");
    }

    void displayBooks() {
        if (count == 0) {
            System.out.println("No books available");
            return;
        }
        System.out.println("ID\tName\tStatus");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }

    void issueBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id && !books[i].isIssued) {
                books[i].isIssued = true;
                System.out.println("Book Issued");
                return;
            }
        }
        System.out.println("Book not available");
    }

    void returnBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id && books[i].isIssued) {
                books[i].isIssued = false;
                System.out.println("Book Returned");
                return;
            }
        }
        System.out.println("Invalid Book ID");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n1.Add Book\n2.Display Books\n3.Issue Book\n4.Return Book\n5.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();
                lib.addBook(id, name);
            } 
            else if (ch == 2) {
                lib.displayBooks();
            } 
            else if (ch == 3) {
                System.out.print("Enter Book ID to Issue: ");
                lib.issueBook(sc.nextInt());
            } 
            else if (ch == 4) {
                System.out.print("Enter Book ID to Return: ");
                lib.returnBook(sc.nextInt());
            } 
            else if (ch == 5) {
                System.out.println("Thank You!");
                break;
            } 
            else {
                System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
