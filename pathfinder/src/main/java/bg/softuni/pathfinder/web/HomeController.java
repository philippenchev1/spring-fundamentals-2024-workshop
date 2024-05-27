package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.Route;
import bg.softuni.pathfinder.services.RouteService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private RouteService routeService;

    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    public String home(Model model) {


        return "index";
    }


}
