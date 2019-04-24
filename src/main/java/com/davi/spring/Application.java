package com.davi.spring;

import com.davi.spring.model.Membro;
import com.davi.spring.repository.MembroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

        MembroRepository rep = ctx.getBean(MembroRepository.class);
        rep.save(new Membro("Davi","Assistente Administrativo"));
        rep.save(new Membro("Daniel","Diretor"));
        rep.save(new Membro("Ricardo","RH"));
        System.out.println(rep.findAll().toString());
    }




}
