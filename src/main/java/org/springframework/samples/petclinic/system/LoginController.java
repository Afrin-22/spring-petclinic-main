package org.springframework.samples.petclinic.system;

import org.springframework.samples.petclinic.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

	// @GetMapping("/")
	public String openForm(Model model) {
		System.out.println("Opening Login Form");
		model.addAttribute("login", new Login());
		return "login";
	}

	// handler to process form
	// @PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("login") Login login, BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		}
		return "welcome";
	}

}
