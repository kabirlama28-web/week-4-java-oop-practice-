class LibraryItem {
    String title;
    String author;
    int id;

    LibraryItem(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    void getInfo() {
        System.out.println(title + " by " + author);
    }
}

class Book extends LibraryItem {
    Book(String title, String author, int id) {
        super(title, author, id);
    }

    @Override
    void getInfo() {
        System.out.println("Book: " + title);
    }
}

class Magazine extends LibraryItem {
    String frequency;

    Magazine(String title, String author, int id, String frequency) {
        super(title, author, id);
        this.frequency = frequency;
    }

    @Override
    void getInfo() {
        System.out.println("Magazine: " + title +
                " Frequency: " + frequency);
    }
}

class Newspaper extends LibraryItem {
    int issueNumber;

    Newspaper(String title, String author, int id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    void getInfo() {
        System.out.println("Newspaper: " + title +
                " Issue: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        LibraryItem[] items = {
                new Book("Java Basics","Ram",1),
                new Magazine("Tech Monthly","Hari",2,"Monthly"),
                new Newspaper("Daily News","Shyam",3,100)
        };

        for (LibraryItem item : items) {
            item.getInfo();
        }
    }
}