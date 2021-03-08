package com.danielLaw.repository;

import org.springframework.data.repository.CrudRepository;
import com.danielLaw.models.Cadastro;

public interface CadastroRepository extends CrudRepository<Cadastro,String>{
	Cadastro findById(long id);
}
