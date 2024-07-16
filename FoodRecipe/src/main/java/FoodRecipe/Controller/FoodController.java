package FoodRecipe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the Food Recipe API!";
        }

        @GetMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the Food Recipe API!";
        }

        @GetMapping("/info")
        public String getInfo() {
            return "This is the Food Recipe API. It is used to manage recipes in a food recipe application.";
        }

        @GetMapping("/confirm")
        public String confirmRecipe() {
            return "Recipe confirmed!";
        }

        @GetMapping("/cancel")
        public String cancelRecipe() {
            return "Recipe cancelled!";
        }

        @GetMapping("/add")
        public String addRecipe() {
            return "Recipe added!";
        }

        @GetMapping("/delete")
        public String deleteRecipe() {
            return "Recipe deleted!";
        }

        @GetMapping("/update")
        public String updateRecipe() {
            return "Recipe updated!";
        }

        @GetMapping("/search")
        public String searchRecipe() {
            return "Recipe found!";
        }
}
