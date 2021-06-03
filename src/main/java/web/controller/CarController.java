package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
//@RequestMapping("/cars") все контроллеры начинают путь с этого URL
public class CarController {

    @Autowired
    @Qualifier(value = "carService")
    private CarService service;

    /*
    required = false для @RequestParam
    делает параметр необязательным, будет положен null
     */
    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("cars", service.getCarsByCount(count));
        return "cars";
    }
}
