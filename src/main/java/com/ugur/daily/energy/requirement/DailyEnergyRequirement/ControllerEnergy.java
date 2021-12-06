package com.ugur.daily.energy.requirement.DailyEnergyRequirement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControllerEnergy {

    @GetMapping("/")
    public String input(Model model) {

        model.addAttribute("human", new Human());

        return "input";
    }

    @PostMapping("output")
    public String output(Model model, Human human) {
        model.addAttribute("human", new Human());
        double resultmale = 66.5 + (13.76 * human.getWeight() + (5.003 * human.getHeight()) - (6.755 * human.getAge()));
        double resultfemale = 655 + (9.563 * human.getWeight()) + (1.85 * human.getHeight()) - (4.676 * human.getAge());
        double resulttotal ;
        model.addAttribute("gender", human.gender);
        System.out.println(human);
        if (human.gender == "female" ) {
            resulttotal = resultfemale;
        }else resulttotal = resultmale;
        model.addAttribute("resulttotal",resulttotal);
        return "output";
    }

}
