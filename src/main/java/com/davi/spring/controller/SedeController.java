package com.davi.spring.controller;

import com.davi.spring.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SedeController {

    @Autowired
    private SedeRepository rep;

    @GetMapping("sede-excluir.html/{id}")
    public RedirectView sedeExcluir(@PathVariable Long id) {
        rep.deleteById(id);
        return new RedirectView("/sede-listar.html");
    }
}
