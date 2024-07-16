package ecommerce2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, welcome to the Product API!";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Goodbye, thank you for using the Product API!";
    }

    @GetMapping("/info")
    public String getInfo() {
        return "This is the  Product API. It is used to manage products in an e-commerce application.";
    }


    @GetMapping("/confirm")
    public String confirmOrder() {
        return "Order confirmed!";
    }


    @GetMapping("/cancel")
    public String cancelOrder() {
        return "Order cancelled!";
    }







}
