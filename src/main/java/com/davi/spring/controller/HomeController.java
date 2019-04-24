package com.davi.spring.controller;

import com.davi.spring.model.Membro;
import com.davi.spring.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MembroRepository rep;

    @RequestMapping("index.html")
    public String home(){
        return "index";
    }

    @RequestMapping("membro-list.html")
    public ModelAndView membros(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro/membro-list");

        List<Membro> membros = rep.findAll();
        mv.addObject("membros",membros);
        return mv;
    }
}
