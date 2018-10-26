package com.cg.springmvcone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvcone.dto.Mobile;

@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao{

	@PersistenceContext
	EntityManager em;
	@Override
	public void addMobile(Mobile mobile) {
		em.persist(mobile);
		em.flush();
		
	}

	@Override
	public List<Mobile> showAllMobile() {
		Query query = em.createQuery("FROM Mobile ORDER BY mobId");
		List<Mobile> myAll = query.getResultList();
		return myAll;
	}

	@Override
	public void deleteMobile(int mobId) {
		Query queryDelete = em.createQuery("DELETE FROM Mobile WHERE mobId=:mobdata");
		queryDelete.setParameter("mobdata", mobId);
		queryDelete.executeUpdate();
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		
		Query querySearch = em.createQuery("FROM Mobile WHERE mobId=:mobdata");
		querySearch.setParameter("mobdata", mobId);
		Mobile mob = (Mobile) querySearch.getResultList().get(0);
		return mob;
	}

}
