package mum.edu.controller;

import mum.edu.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")

public class AdviceController {
    @Autowired
    AdviceService adviceService;

    @RequestMapping(value = {"/","/advice"}, method = RequestMethod.GET)
    public String adviceForm(Model model){
        Map<Integer, String> roasts = adviceService.getAllRoasts();
        model.addAttribute("roasts", roasts);
        return "advice";
    }

    @RequestMapping(value = "/advice", method = RequestMethod.POST)
    public  String adviceList(Integer roastKey, Model model){
        String roast = adviceService.getRoast(roastKey);
        List<String> roastList = adviceService.getListByType(roast);

        model.addAttribute("roast", roast);
        model.addAttribute("roastList", roastList);

        return "display";
    }
}
