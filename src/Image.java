public class Image implements ChapterComponent {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // An image cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + name);
    }
}
