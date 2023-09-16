package com.praka.config.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praka.config.entity.Diff;

public interface DiffRepo extends JpaRepository<Diff, Integer>{

}
