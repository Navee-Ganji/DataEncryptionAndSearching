package com.praka.config.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praka.config.entity.Dh_no;

public interface Dhh_noRepo extends JpaRepository<Dh_no, Integer>{
	List<Dh_no> findByDhnoBetween(String startDhh_no , String endDhh_no);

}
