package com.senai.projetod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senai.projetod.models.Cadastro;
import com.senai.projetod.repository.CadastroRepository;

@Controller
public class CadastroController {
	@Autowired
	private CadastroRepository cr;
	
	
	
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public String form() {
		return "evento/formCadastro";
	}
	
	
	@RequestMapping(value="/cadastro", method = RequestMethod.POST)
	public String form(Cadastro cadastro) {
		
		cr.save(cadastro);
		return "redirect:/cadastro";
	}

	
	
}
