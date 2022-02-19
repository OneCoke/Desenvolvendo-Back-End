package com.senai.projetod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senai.projetod.models.Produto;
import com.senai.projetod.repository.ProdutoRepository;

@Controller

public class ProdutoController {

	@Autowired
private ProdutoRepository pr;



@RequestMapping(value="/produto", method = RequestMethod.GET)
public String form() {
	return "evento/formProduto";
}


@RequestMapping(value="/produto", method = RequestMethod.POST)
public String form(Produto produto) {
	
	pr.save(produto);
	return "redirect:/produto";
	}

}
