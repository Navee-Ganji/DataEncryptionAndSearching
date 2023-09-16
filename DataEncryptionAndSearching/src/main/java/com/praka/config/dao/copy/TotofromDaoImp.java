package com.praka.config.dao.copy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.praka.config.Service1.Service1Interface;
import com.praka.config.entity.Dh_no;
import com.praka.config.entity.Sorteddata;
import com.praka.config.entity.Totofrom;
import com.praka.config.repositorys.TotofromRepo;
@Component
public class TotofromDaoImp implements TotofromDao{
	@Autowired
	private TotofromRepo repo;
	@Autowired
	private Service1Interface service;
	@Autowired
	private Dh_noDao dhDao;
	@Autowired
	private SorteddataDao sDao;

	private int count = 0;
	@Override
	public Totofrom getDh_no(int s_No) {
		Totofrom en = repo.findById(s_No).get();
		
		String to = service.encodeHNo(en.getTo());
		String from = service.encodeHNo(en.getFrom());
		System.out.println(en.getTo());
		System.out.println(en.getFrom());
		List<Dh_no> list = dhDao.between(to, from);
		
			for (Dh_no dh_no : list) {
				Sorteddata data = new Sorteddata();
				data.setDh_no(dh_no.getDhh_no());
				data.setS_no(dh_no.getS_no());
				data.setPs(en.getPs());
				data.setSec(count);
				data.setSec(en.getSce());
				data.setOdh_no(dh_no.getOdh_No());
				sDao.save(data);
			}	
		return en;
	}
}
