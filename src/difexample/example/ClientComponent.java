package difexample.example;

public class ClientComponent {
    private final TransientComponent tc;
    private final SingletonComponent sc;

    public ClientComponent(TransientComponent tc, SingletonComponent sc) {
        this.tc = tc;
        this.sc = sc;
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }

    public String getClientMessage() {
        return "Hello from ClientComponent = " + this;
    }
}