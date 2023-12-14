package models;

import java.util.concurrent.TimeUnit;

class Image implements Picture, ChapterComponent {
    private String name;

    public Image(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("models.Image name: " + name);
    }

    @Override
    public void addSubchapter(ChapterComponent chapterComponent) {
        // An image cannot contain subchapters, so this method can be left empty.
    }

    @Override
    public void print() {
        display();
    }
}
