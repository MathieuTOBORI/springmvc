package org.formation.spring.test;

import org.formation.spring.model.Adresse;
import org.formation.spring.model.Client;
import org.formation.spring.service.IPrestiBanqueService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_TP5 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPrestiBanqueService service = (IPrestiBanqueService) context.getBean("metier");
		service.listClients();
		service.addClient(new Client("toto","tata","log2","mdp2",new Adresse(36, "avenue Cyrnos", "Paris")));
		service.addClient(new Client("Bernard","Tapie","log2","mdp2",new Adresse(36, "avenue Cyrnos", "Paris")));
	    System.out.println("!!!!!!!!!!\n"+service.listClients());


	}

}
