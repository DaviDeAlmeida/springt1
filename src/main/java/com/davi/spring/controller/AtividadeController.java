package com.davi.spring.controller;

import com.davi.spring.model.Atividade;
import com.davi.spring.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AtividadeController {

    @Autowired
    private AtividadeRepository rep;

    @GetMapping("atividade-listar.html")
    public ModelAndView atividadeListar(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividade-listar");

        List<Atividade> atividades = rep.findAll();
        mv.addObject("atividades",atividades);
        return mv;
    }

    @GetMapping("atividade-excluir.html/{id}")
    public RedirectView atividadeExcluir(@PathVariable Long id) {
        rep.deleteById(id);
        return new RedirectView("/atividade-listar.html");
    }
}
