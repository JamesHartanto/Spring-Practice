package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;


/**
 * Created by JamesHartanto on 4/11/17.
 */
@Controller
public class FlagController {
    @RequestMapping("/country")
    public String countryTimes(Model model){
        model.addAttribute("EastCoastTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("US/Eastern")));
        model.addAttribute("WestCoastTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("US/Pacific")));
        model.addAttribute("ItalyTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Rome")));
        model.addAttribute("FranceTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Paris")));
        model.addAttribute("AustraliaTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Australia/Sydney")));
        model.addAttribute("JapanTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Japan")));
        model.addAttribute("ChinaTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Shanghai")));
        model.addAttribute("MexicoTime", ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Mexico/General")));

        return "flags";
    }
}
