package difexample.example;

public class TransientComponent {
    public TransientComponent() {
        System.out.println("TransientComponent::TransientComponent = " + this);
    }

    public void operation() {
        System.out.println("Invoked TransientComponent::operation() on " + this);
    }
}

