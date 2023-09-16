package com.praka.config.dao.copy;

import java.util.List;

import com.praka.config.entity.Dh_no;

public interface Dh_noDao {
	Dh_no saveData(Dh_no dhn);
	List<Dh_no> between(String s1, String s2);
}
