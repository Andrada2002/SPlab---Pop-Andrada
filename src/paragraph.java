
public class paragraph implements ChapterComponent {
    private String content;

    public paragraph(String content) {
        this.content = content;
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // A paragraph cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + content);
    }
}