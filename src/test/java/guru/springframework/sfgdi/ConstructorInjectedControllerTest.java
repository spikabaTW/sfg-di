package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.ConstructorInjetedController;
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;

public class ConstructorInjectedControllerTest {
    
    ConstructorInjetedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjetedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
