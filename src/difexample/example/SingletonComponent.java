package difexample.example;

public class SingletonComponent {
    private static SingletonComponent instance;

    public SingletonComponent() {
        System.out.println("SingletonComponent::SingletonComponent = " + this);
    }

    public static SingletonComponent getInstance() {
        if (instance == null) {
            instance = new SingletonComponent();
        }
        return instance;
    }

    public void operation() {
        System.out.println("Invoked SingletonComponent::operation() on " + this);
    }
}
