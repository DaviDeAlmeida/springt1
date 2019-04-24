package com.davi.spring.model;

import java.util.Date;

public class Atividade {

    private int id;
    private String titulo;
    private String descicao;
    private Date dataInicio;
    private Date dataFim;
    private String categoria;

    public Atividade() {
    }

    public Atividade(int id, String titulo, String descicao, Date dataInicio, Date dataFim, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descicao = descicao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descicao='" + descicao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
