package org.formation.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import antlr.collections.List;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private  IPrestiBanqueService service;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		service.addClient(new Client("toto","tata","log2","mdp2",new Adresse(36, "avenue Cyrnos", "Paris")));
		service.addClient(new Client("Bernard","Tapie","log2","mdp2",new Adresse(36, "avenue Cyrnos", "Paris")));

		
		return "home";
	}
	
	@RequestMapping(value="/clients/list")
	public  String	index(Model	model) {
		
		model.addAttribute("client",new Client("bob", "bill", "login", "pass",null));
		model.addAttribute("clients",service.listClients());
		return "clientsview";
	}

//	@RequestMapping(value="/clients/list2")
//	@ModelAttribute("clients")
//	public  java.util.List<Client>	index2() {
//		return service.listClients();
//	}

	
}
