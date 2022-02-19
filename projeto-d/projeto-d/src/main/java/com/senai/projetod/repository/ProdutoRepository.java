package com.senai.projetod.repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.projetod.models.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, String>{

}
