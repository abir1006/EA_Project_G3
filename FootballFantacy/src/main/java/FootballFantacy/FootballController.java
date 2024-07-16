package FootballFantacy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football")
public class FootballController {

        @RequestMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the Football API!";
        }

        @RequestMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the Football API!";
        }

        @RequestMapping("/info")
        public String getInfo() {
            return "This is the Football API. It is used to manage football teams and players in a fantasy football application.";
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
