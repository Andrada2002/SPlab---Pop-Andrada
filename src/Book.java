import java.util.ArrayList;

/*public class Book {
    private String title;
    private ArrayList<Chapter>chapters;
    private ArrayList<Author>authors;

    public Book(String title, ArrayList<Author>authors){
        this.title = title;
        this.authors = authors;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(String chapterTitle){
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
    }

    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Authors: ");
        for (Author author :authors){
            author.print();
        }
        System.out.println("Chapters: ");
        for (Chapter chapter : chapters){
            chapter.print();
        }
    }
}

 */
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
