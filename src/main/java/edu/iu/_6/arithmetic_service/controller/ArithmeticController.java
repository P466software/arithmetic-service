package edu.iu._6.arithmetic_service.controller;

import edu.iu._6.arithmetic_service.service.IAirthmeticService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/add")
public class ArithmeticController {
    IAirthmeticService arithmeticService;
    public ArithmeticController(IAirthmeticService airthmeticService)
    {
        this.arithmeticService = airthmeticService;
    }

    @GetMapping
    public String greetings(){
        return "Welcome to arithmetic services!";
    }

    @GetMapping("/{n}/{m}")
    public int addNumbs(@PathVariable int n, @PathVariable int m){
        return arithmeticService.addNumbs(n, m);
    }
}
