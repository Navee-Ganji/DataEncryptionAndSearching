package com.praka.config.dao.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praka.config.entity.Dh_no;
import com.praka.config.repositorys.Dhh_noRepo;
@Component
public class Dh_noDaoImp implements Dh_noDao{
	@Autowired
	private Dhh_noRepo repo;
	@Override
	public Dh_no saveData(Dh_no dhn) {
		Dh_no dh = repo.save(dhn);
		return null;
	}
	@Override
	public List<Dh_no> between(String s1, String s2) {
		List<Dh_no> list = repo.findByDhnoBetween(s1, s2);
		
		return list;
	}
	
}
