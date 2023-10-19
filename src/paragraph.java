public class paragraph {
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