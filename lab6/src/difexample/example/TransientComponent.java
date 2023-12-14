package difexample.example;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TransientComponent {
    private Object ConfigurableBeanFactory;

    public TransientComponent() {
        System.out.println("TransientComponent::TransientComponent = "

                + this);
    }
    public void operation() {
        System.out.println("Invoked TransientComponent::operation() on " + this);

    }
}
