/*public class paragraph {
    public String name;
    public paragraph(String name){
        this.name = name;

    }
    public paragraph(){

        this.name ="";
    }
    public void setparagraphName(String name){
        this.name=name;
    }
    public String print(){
        return "Numele paragrafului"+name;
    }
}

 */
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