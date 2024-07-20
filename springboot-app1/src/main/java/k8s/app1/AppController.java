package k8s.app1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/api/order")
    public String getOrders() {
        int sum = 0;
        for (int i = 0; i < 500000000; i++) {
            sum += 1;
        }
        return "All order list";
    }

}
