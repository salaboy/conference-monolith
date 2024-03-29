package com.salaboy.conferences.site;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}

@Controller
class ConferenceSiteController {
    @Value("${version:0}")
    private String version;

    @GetMapping("/")
    public String index(Model model) {

        
        String agendaString = "Here goes the Agenda Section";
        String sponsorsString = "Here goes the Sponsors Section";

        model.addAttribute("version", version);
        model.addAttribute("sponsors", sponsorsString);
        model.addAttribute("agenda", agendaString);
        return "index";
    }

}
