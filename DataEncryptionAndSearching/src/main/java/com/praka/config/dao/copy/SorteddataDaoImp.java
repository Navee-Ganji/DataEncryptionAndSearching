package com.praka.config.dao.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praka.config.entity.Sorteddata;
import com.praka.config.repositorys.SorteddataRepo;
@Component
public class SorteddataDaoImp implements SorteddataDao{
	
	@Autowired
	private SorteddataRepo repo;
	@Override
	public Sorteddata save(Sorteddata data) {
		Sorteddata sd = repo.save(data);
		return sd;
	}

}
