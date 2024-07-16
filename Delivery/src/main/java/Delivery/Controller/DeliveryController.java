package Delivery.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the Delivery API!";
        }

        @GetMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the Delivery API!";
        }

        @GetMapping("/info")
        public String getInfo() {
            return "This is the Delivery API. It is used to manage deliveries in an e-commerce application.";
        }

        @GetMapping("/confirm")
        public String confirmDelivery() {
            return "Delivery confirmed!";
        }

        @GetMapping("/cancel")
        public String cancelDelivery() {
            return "Delivery cancelled!";
        }
}
