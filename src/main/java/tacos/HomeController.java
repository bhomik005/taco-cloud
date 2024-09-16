package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // Handles requests for the root path / -> return a string
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
