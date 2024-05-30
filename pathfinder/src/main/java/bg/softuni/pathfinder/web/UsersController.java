package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.dtos.UserRegisterDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.http.HttpClient;

@Controller
public class UsersController {



    @GetMapping("/users/register")
    public String register(Model model) {
        model.addAttribute("registerData", new UserRegisterDto());

        return "register";
    }


    @PostMapping("/users/register")
    public String doRegister(@Valid UserRegisterDto data,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("registerData", data);


            // handle errors
            return "register";
        }


        // register user
        return "redirect:/users/login";
    }

    @GetMapping("/users/login")
    public String login(){
        return "login";
    }
}
