
public class image {
    public String name;
    public image(String name){
        this.name = name;

    }
    public image(){
        this.name ="";
    }
    public void setimageName(String name){
        this.name=name;
    }
    public String print(){
        return "Numele imagini "+name;
    }
}