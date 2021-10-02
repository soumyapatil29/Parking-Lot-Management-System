package com.parking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TopLevelController {
	@RequestMapping("/")
	public String loginPage() {
		return "login";
	}

    @RequestMapping("/home")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/tariff")
    public String tariffPage() {
        return "tariff";
    }

    @RequestMapping("/stats")
    public String statsPage() {
        return "stats";
    }

    @RequestMapping("/reset")
    public String resetPage() {
        return "reset";
    }
    
    @RequestMapping("/status")
    public String statusPage() {
        return "status";
    }
}
