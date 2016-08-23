package org.formation.spring.dao;

import java.io.Serializable;
import java.util.List;

import org.formation.spring.model.Client;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository("daoHibernate")
public class ClientDaoImplHibernate implements IClientDao {

	
	private SessionFactory sessionFactory;

	//@Autowired
	public ClientDaoImplHibernate(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}

	
	@Override
	@Transactional
	public void addClient(Client c) {
		Serializable id = sessionFactory.getCurrentSession().save(c);
		System.out.println("dans ClientDaoImpl.addClient --> client ajouté !="+id);
	}

	@Override
	@Transactional
	public List<Client> listClients() {
		System.out.println("dans ClientDaoImpl.listClients() --> retourne la liste des clients");
		Query query = sessionFactory.getCurrentSession().createQuery("from Client");
		return query.list();
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
