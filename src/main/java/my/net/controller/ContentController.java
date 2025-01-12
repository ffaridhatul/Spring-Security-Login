package my.net.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String login(Model model) {
        // logika tambahan jika diperlukan
        return "login"; // Pastikan ini mengarah ke file view yang benar, misalnya login.html
    }

    @GetMapping("req/signup")
    public String signup() {
        return "signup";
    }
}
