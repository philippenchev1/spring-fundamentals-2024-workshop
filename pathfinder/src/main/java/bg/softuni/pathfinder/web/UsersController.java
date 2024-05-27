package bg.softuni.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/users/login")
    public String login(){
        return "login";
    }

    @GetMapping("/users/register")
    public String register(){
        return "register";
    }
}
