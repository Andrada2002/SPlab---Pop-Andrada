package models;
/*public class models.paragraph implements ChapterComponent {
    private String content;

    public models.paragraph(String content) {
        this.content = content;
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // A models.paragraph cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + content);
    }
}

 */

public class paragraph implements ChapterComponent {
    private String content;
    private AlignStrategy alignStrategy;

    public paragraph(String content) {
        this.content = content;
        this.alignStrategy = new AlignLeft(); // Setăm o aliniere implicită ca fiind la stânga.
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // A models.paragraph cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        alignStrategy.render("Paragraph: " + content);
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}
