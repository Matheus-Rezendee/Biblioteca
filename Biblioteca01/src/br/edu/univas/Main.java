package br.edu.univas;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca");

        Livro l1 = new Livro("OO", "José", true);
        Livro l2 = new Livro("POO", "Paulo", true);
        Livro l3 = new Livro("java", "Maria", false);

        Autor a1 = new Autor("Autor x");
        Autor a2 = new Autor("Autor y");
        Autor a3 = new Autor("Autor z");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.adicionarAutor(a1);
        biblioteca.adicionarAutor(a2);
        biblioteca.adicionarAutor(a3);

        System.out.println(biblioteca.verificarDisponibilidade("OO"));
        System.out.println(biblioteca.verificarDisponibilidade("POO"));
        System.out.println(biblioteca.verificarDisponibilidade("java"));

    }
}
