package bank.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("/balance")
    public String getBalance() {
        return "here is your balance";
    }

    @GetMapping("/deposit")
    public String deposit() {
        return "Deposit successful!";
    }

    @GetMapping("/withdraw")
    public String withdraw() {
        return "Withdrawal successful!";
    }

    @GetMapping("/transfer")
    public String transfer() {
        return "Transfer successful!";
    }

    @GetMapping("/paybill")
    public String paybill() {
        return "Bill payment successful!";
    }

}
