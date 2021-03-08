package com.danielLaw.repository;

import org.springframework.data.repository.CrudRepository;

import com.danielLaw.models.Pessoas;

public interface PessoaRepository extends CrudRepository<Pessoas,String>{
	Pessoas findById(long id);

}