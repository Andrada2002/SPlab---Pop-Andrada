package services;

import models.Section;

public class RenderContentVisitor implements Visitor{

    @Override
    public void visitBook(Book book) {
        book.print();
    }

    @Override
    public void visitSection(Section section) {
        section.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
    }

    @Override
    public void visitParagraph(paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }
}
