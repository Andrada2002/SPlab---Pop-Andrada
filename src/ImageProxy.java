class ImageProxy implements Picture, ChapterComponent {
    private String name;
    private Image realImage;

    public ImageProxy(String name) {
        this.name = name;
        this.realImage = null;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        realImage.display();
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // An image proxy cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        display();
    }

    Image loadImage() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        return realImage;
    }
}
