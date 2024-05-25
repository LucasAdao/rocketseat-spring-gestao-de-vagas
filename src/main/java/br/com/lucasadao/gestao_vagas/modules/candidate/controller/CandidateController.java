package br.com.lucasadao.gestao_vagas.modules.candidate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lucasadao.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	@PostMapping("/")
	//o valid serve para usar as verificações criadas no objeto
	public void create(@Valid @RequestBody CandidateEntity candidateEntity){
		System.out.println("Candidato:");
		System.out.println(candidateEntity.getEmail());
	}

}
