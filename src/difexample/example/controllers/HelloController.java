package difexample.example.controllers;

import difexample.example.ClientComponent;

public class HelloController {
    private final ClientComponent clientComponent;

    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    public String sayHello() {
        return clientComponent.getClientMessage();
    }
}

