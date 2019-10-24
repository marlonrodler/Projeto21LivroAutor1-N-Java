/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Livro {

    private String titulo;
    private String editora;
    private int ano;
    private ArrayList<Autor> escritores;

    public Livro() {
    }

    public Livro(String titulo, String editora, int ano, ArrayList<Autor> escritores) {
        this.escritores = new ArrayList<>();
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
        this.escritores = escritores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<Autor> getEscritores() {
        return escritores;
    }

    public void setEscritores(ArrayList<Autor> escritores) {
        this.escritores = escritores;
    }

}
