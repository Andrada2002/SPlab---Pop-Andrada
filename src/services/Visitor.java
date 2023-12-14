package services;

import models.Section;
import models.Book;
import models.TableOfContents;
import models.paragraph;
import models.ImageProxy;
import models.Image;
import models.Table;

public interface Visitor{
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
