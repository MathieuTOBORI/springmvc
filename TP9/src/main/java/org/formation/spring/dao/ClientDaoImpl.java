package org.formation.spring.dao;

import java.util.List;

import org.formation.spring.model.Client;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class ClientDaoImpl implements IClientDao {

	@Override
	public void addClient(Client c) {
		System.out.println("dans ClientDaoImpl.addClient --> client ajouté !");
	}

	@Override
	public List<Client> listClients() {
		System.out.println("dans ClientDaoImpl.listClients() --> retourne la liste des clients");
		return null;
	}

	@Override
	public void deleteClient(int idClient) {
		System.out.println("dans ClientDaoImpl.deleteClient --> client supprimé !");
	}

	@Override
	public Client editClient(int idClient) {
		System.out.println("dans ClientDaoImpl.editClient --> retourne un client é editer");
		return null;
	}

	public void updateClient(Client c) {
		System.out.println("dans ClientDaoImpl.updateClient --> client mis é jour !");
	}

	@Override
	public List<Client> chercherClients(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

}
