package com.danielLaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.danielLaw.models.Pessoas;
import com.danielLaw.repository.CadastroRepository;
import com.danielLaw.repository.EstadoCivilRepository;
import com.danielLaw.repository.PessoaRepository;

@Controller
public class CadastroController {

	@Autowired
	private CadastroRepository cr;
	
	@Autowired
	private PessoaRepository pr;
	
	@Autowired
	private EstadoCivilRepository er;
	
	@RequestMapping(value="/cadastro", method=RequestMethod.GET)
	public String form() {
		
		return "cadastro/formCadastro";
	}
	
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public String form(Pessoas pessoa) {
		
		pr.save(pessoa);
		
		
		return "redirect:/cadastro";
	}
	
	@RequestMapping("/clientesCadastrados")
	public ModelAndView listaCadastrados() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Pessoas> pessoa = pr.findAll();
		mv.addObject("clientesCadastrados", pessoa);
		return mv;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView detalhesCliente(@PathVariable("id") long id) {
		Pessoas pessoa = pr.findById(id);
		ModelAndView mv = new ModelAndView("cadastro/detalhesCliente");
		mv.addObject("pessoa", pessoa);
		
		return mv;	
	}
	
	/*
	 * @RequestMapping(value="/{id}", method=RequestMethod.POST) public String
	 * detalhesClientePost(@PathVariable("id") long id, Estado_civil estado_civil) {
	 * Pessoas pessoa = pr.findById(id); estado_civil.setPessoas(pessoa);
	 * er.save(estado_civil); return "redirect:/{id}"; }
	 */
	
}
