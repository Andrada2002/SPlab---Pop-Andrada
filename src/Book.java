import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private ArrayList<ChapterComponent> chaptersAndContents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(ChapterComponent chapterComponent) {
        chaptersAndContents.add(chapterComponent);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println(author.toString());
        }
        System.out.println("Contents:");
        for (ChapterComponent chapterComponent : chaptersAndContents) {
            chapterComponent.print();
        }
    }
}
