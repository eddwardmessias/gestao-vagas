package br.com.edd.gestao_vagas.controllers;

import br.com.edd.gestao_vagas.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {


    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity){
        System.out.println("Candidado");
        System.out.println(candidateEntity.getEmail());
    }

}
