package com.davi.spring;

import com.davi.spring.model.Atividade;
import com.davi.spring.model.Membro;
import com.davi.spring.repository.AtividadeRepository;
import com.davi.spring.repository.MembroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

        MembroRepository repMembro = ctx.getBean(MembroRepository.class);
        repMembro.save(new Membro("Davi","Assistente Administrativo"));
        repMembro.save(new Membro("Daniel","Diretor"));
        repMembro.save(new Membro("Ricardo","RH"));

        AtividadeRepository repAtividade = ctx.getBean(AtividadeRepository.class);
        repAtividade.save(new Atividade("Atividade1","Descricao1"));
        repAtividade.save(new Atividade("Atividade2","Descricao2"));
        repAtividade.save(new Atividade("Atividade3","Descricao3"));
        repAtividade.save(new Atividade("Atividade4","Descricao4"));

        System.out.println(repMembro.findAll().toString());
        System.out.println(repAtividade.findAll().toString());
    }




}
