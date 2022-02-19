package com.senai.projetod.repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.projetod.models.BancoHoras;

public interface BancoHorasRepository extends CrudRepository<BancoHoras, String>{
	
}