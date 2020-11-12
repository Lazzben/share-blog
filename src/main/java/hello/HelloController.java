package hello;

import hello.service.OrderService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@RestController
public class HelloController {
    private final OrderService orderService;

    @Inject
    public HelloController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/")
    public String index() {
        orderService.placeOrder();
        return "Greetings from Spring Boot!";
    }
}