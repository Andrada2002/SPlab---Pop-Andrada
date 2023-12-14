package models;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}
