// src/main/java/difexample/MyComponent.java
package difexample;

public class MyComponent {
    public MyComponent() {
        System.out.println("MyComponent::MyComponent = " + this);
    }

    public void operation() {
        System.out.println("Invoked MyComponent::operation() on " + this);
    }
}

