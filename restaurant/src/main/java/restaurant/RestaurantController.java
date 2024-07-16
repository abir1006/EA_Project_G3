package restaurant;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

        @RequestMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the Restaurant API!";
        }

        @RequestMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the Restaurant API!";
        }

        @RequestMapping("/info")
        public String getInfo() {
            return "This is the Restaurant API. It is used to manage restaurants and menus in a food delivery application.";
        }

        @RequestMapping("/confirm")
        public String confirmOrder() {
            return "Order confirmed!";
        }

        @RequestMapping("/cancel")
        public String cancelOrder() {
            return "Order cancelled!";
        }
}
