package E_learning.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elearning")
public class ElearningController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the E-learning API!";
        }

        @GetMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the E-learning API!";
        }

        @GetMapping("/info")
        public String getInfo() {
            return "This is the E-learning API. It is used to manage courses in an e-learning application.";
        }

        @GetMapping("/confirm")
        public String confirmCourse() {
            return "Course confirmed!";
        }

        @GetMapping("/cancel")
        public String cancelCourse() {
            return "Course cancelled!";
        }

        @GetMapping("/register")
        public String registerCourse() {
            return "Course registered!";
        }
}
