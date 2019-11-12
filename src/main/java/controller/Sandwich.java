package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class Sandwich {
    private ArrayList<String> list = new ArrayList<>();
    @GetMapping("")
    public String get(Model model){
        ArrayList<String> spiceList = new ArrayList<>();
        spiceList.add("Lettuce");
        spiceList.add("Tomato");
        spiceList.add("Mustard");
        spiceList.add("Sprout");

        model.addAttribute("Spice",spiceList);
        list = spiceList;
        return "index";
    }

    @PostMapping("/showSandwich")
    public String showSandwich (@RequestParam("Spice") String[] spiceList , Model model){
        String result ="";
        for(String con : spiceList){
            result += con+ ", ";
        }
        result=result.substring(0,result.length()-2);
        model.addAttribute("Spice",list);
        model.addAttribute("result",result);
        return  "index";
    }


}
