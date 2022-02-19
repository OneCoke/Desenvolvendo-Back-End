package com.senai.projetod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.senai.projetod.models.BancoHoras;
import com.senai.projetod.repository.BancoHorasRepository;

@Controller
public class BancoHorasController {

	@Autowired
	private BancoHorasRepository br;
	
	
	
	@RequestMapping(value="/banco", method = RequestMethod.GET)
	public String form() {
		return "evento/formBanco";
	}
	
	
	@RequestMapping(value="/banco", method = RequestMethod.POST)
	public String form(BancoHoras bancohoras) {
		
		br.save(bancohoras);
		return "redirect:/banco";
	}

}