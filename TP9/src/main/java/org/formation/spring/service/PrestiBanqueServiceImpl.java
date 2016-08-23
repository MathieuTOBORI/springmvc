package org.formation.spring.service;

import java.util.List;

import org.formation.spring.dao.IClientDao;
import org.formation.spring.model.Client;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

//@Service("metier")
public class PrestiBanqueServiceImpl implements IPrestiBanqueService {
	
	//@Resource(name="daoHibernate")
	private IClientDao clientDao;

	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public void addClient(Client c) {
		clientDao.addClient(c);

	}

	@Override
	public List<Client> listClients() {
		
		return clientDao.listClients();
	}

	@Override
	public void deleteClient(int idClient) {
		clientDao.deleteClient(idClient);

	}

	@Override
	public Client editClient(int idClient) {
		return clientDao.editClient(idClient);
	}

	@Override
	public void updateClient(Client c) {
		clientDao.updateClient(c);

	}

	@Override
	public List<Client> chercherClients(String motCle) {
		return clientDao.chercherClients(motCle);
	}

}
