package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(defaultValue = "5") int count, Model model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getAllCars());

        if (count >= 5) {
            model.addAttribute("cars", carService.getAllCars());
        } else model.addAttribute("cars", carService.getAllCars().subList(0, count));
        return "car";
    }
}