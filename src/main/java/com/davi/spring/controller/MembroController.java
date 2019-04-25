package com.davi.spring.controller;

import com.davi.spring.model.Membro;
import com.davi.spring.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class MembroController {

    @Autowired
    private MembroRepository rep;

    @GetMapping("membro-listar.html")
    public ModelAndView membros(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-listar");

        List<Membro> membros = rep.findAll();
        mv.addObject("membros",membros);
        return mv;
    }

    @GetMapping("membro-excluir.html/{id}")
    public RedirectView membroExcluir(@PathVariable Long id) {
        rep.deleteById(id);
        return new RedirectView("/membro-listar.html");
    }


}
