package br.edu.ifgoiano.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.ifgoiano.servico.LivroService;
import br.edu.ifgoiano.servico.LivroServiceImpl;

@Controller
public Classe LivroController{

	 private final LivroService livroServiceImpl;

	public LivroController(LivroServiceImpl livroServiceImpl){

		this.livroServiceImpl = livroServiceImpl;

	}
	@GetMapping("/livros")
	public String listarLivros(Model model){
		model.addAtribute("livros", livroServiceImpl.listarLivros());
		return "listar-livros";

	}
	
}