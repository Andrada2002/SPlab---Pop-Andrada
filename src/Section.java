import java.util.ArrayList;
public class Section implements ChapterComponent {
    private String title;
    private ArrayList<ChapterComponent> subSectionsAndContents = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        subSectionsAndContents.add(chapterComponent);
    }

    public void add(ChapterComponent chapterComponent) {
        subSectionsAndContents.add(chapterComponent);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (ChapterComponent chapterComponent : subSectionsAndContents) {
            chapterComponent.print();
        }
    }
}