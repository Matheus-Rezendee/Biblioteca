package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;

    List<Livro> livros;
    List<Autor> autores;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro){

        livros.add(livro);

    }
    public void adicionarAutor(Autor autor){

        autores.add(autor);

    }
    public boolean verificarDisponibilidade(String livro){

        boolean disponibilidade = false;
        for (Livro l  : livros) {
            if (l.getTitulo().equals(livro)){
                disponibilidade = l.isDisponivel();
            }
        }
        return disponibilidade;


    }


    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
}
