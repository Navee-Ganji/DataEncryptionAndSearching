package com.praka.config.dao.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praka.config.Service1.Service1;
import com.praka.config.entity.Dh_no;
import com.praka.config.entity.Diff;
import com.praka.config.repositorys.DiffRepo;

@Component
public class dIFDaoImp implements DifDao{
	
	@Autowired
	private DiffRepo repo;
	@Autowired
	private Dh_noDao dao;
	@Autowired
	private Service1 service;
	@Override
	public Diff getData(int s_no) {
		Diff d ;
		try {
			d = repo.findById(s_no).get();
		} catch (Exception e) {
			return new Diff();
		}
		
		String s = service.encodeHNo(d.getH_No());
		System.out.println(d.getH_No());
		System.out.println(s);
		Dh_no d1 = new Dh_no();
		d1.setS_no(d.getS_No());
		d1.setDhh_no(s);
		d1.setOdh_No(d.getH_No());
		dao.saveData(d1);
		return d;
	}

}
